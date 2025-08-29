oldRows.stream()
        .map(oldRow -> oldRow.getCellValue(keyColumn.getCellIndex()))
        .filter(key -> !ExpressionUtils.isNonBlankData(key))
        .forEach(key -> {
            if (unchangedColumns.isEmpty()) {
                reusableRow = new Row(newColumns.size());
                newRows.add(reusableRow);
                currentRows.clear();
                currentRows.add(reusableRow);
            } else {
                newRows.add(buildNewRow(unchangedColumns, oldRow, unchangedColumns.size()));
            }
        });

oldRows.stream()
        .map(oldRow -> oldRow.getCellValue(keyColumn.getCellIndex()))
        .filter(key -> ExpressionUtils.isNonBlankData(key))
        .map(Object::toString)
        .filter(keyString -> keyString.equals(recordKey) || recordKey == null)
        .forEach(keyString -> {
            reusableRow = new Row(newColumns.size());
            newRows.add(reusableRow);
            currentRows.clear();
            currentRows.add(reusableRow);

            Column newColumn = keyValueToColumn.get(keyString);
            if (newColumn == null) {
                newColumn = new Column(project.columnModel.allocateNewCellIndex(), project.columnModel.getUnduplicatedColumnName(keyString));
                keyValueToColumn.put(keyString, newColumn);
                newColumns.add(newColumn);
                if (recordKey == null) {
                    recordKey = keyString;
                }
            }

            if (unchangedColumns.size() > 0) {
                StringBuilder sb = new StringBuilder();
                unchangedColumns.stream()
                        .map(unchangedColumn -> oldRow.getCellValue(unchangedColumn.getCellIndex()))
                        .filter(Objects::nonNull)
                        .forEach(cellValue -> sb.append(cellValue).append('\0'));
                String unchangedCellValues = sb.toString();

                reusableRow = groupByCellValuesToRow.get(unchangedCellValues);
                if (reusableRow == null || reusableRow.getCellValue(valueColumn.getCellIndex()) != null) {
                    reusableRow = buildNewRow(unchangedColumns, oldRow, newColumn.getCellIndex() + 1);
                    groupByCellValuesToRow.put(unchangedCellValues, reusableRow);
                    newRows.add(reusableRow);
                }
            }

            Cell cell = oldRow.getCell(valueColumn.getCellIndex());
            if (unchangedColumns.size() == 0) {
                int index = newColumn.getCellIndex();
                Row row = getAvailableRow(currentRows, newRows, index);
                row.setCell(index, cell);
            } else {
                reusableRow.setCell(newColumn.getCellIndex(), cell);
            }

            if (noteColumn != null) {
                Object noteValue = oldRow.getCellValue(noteColumn.getCellIndex());
                if (ExpressionUtils.isNonBlankData(noteValue)) {
                    Column newNoteColumn = keyValueToNoteColumn.get(keyString);
                    if (newNoteColumn == null) {
                        newNoteColumn = new Column(project.columnModel.allocateNewCellIndex(), project.columnModel.getUnduplicatedColumnName(noteColumn.getName() + " : " + keyString));
                        keyValueToNoteColumn.put(keyString, newNoteColumn);
                        newNoteColumns.add(newNoteColumn);
                    }
                    int newNoteCellIndex = newNoteColumn.getCellIndex();
                    Object existingNewNoteValue = reusableRow.getCellValue(newNoteCellIndex);
                    if (ExpressionUtils.isNonBlankData(existingNewNoteValue)) {
                        Cell concatenatedNoteCell = new Cell(existingNewNoteValue.toString() + ";" + noteValue.toString(), null);
                        reusableRow.setCell(newNoteCellIndex, concatenatedNoteCell);
                    } else {
                        reusableRow.setCell(newNoteCellIndex, oldRow.getCell(noteColumn.getCellIndex()));
                    }
                }
            }
        });