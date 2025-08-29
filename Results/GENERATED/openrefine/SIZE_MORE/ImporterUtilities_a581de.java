columnNames.stream()
    .map(cell -> CharMatcher.whitespace().trimFrom(cell))
    .map(cell -> cell.isEmpty() ? "Column" : (cell.startsWith("\"") && cell.endsWith("\"") ? cell.substring(1, cell.length() - 1).trim() : cell))
    .forEach(cell -> {
        if (nameToIndex.containsKey(cell)) {
            int index = nameToIndex.get(cell);
            nameToIndex.put(cell, index + 1);
            cell = cell.contains(" ") ? (cell + " " + index) : (cell + index);
        } else {
            nameToIndex.put(cell, 2);
        }
        int c = columnNames.indexOf(cell);
        columnNames.set(c, cell);
        if (project.columnModel.getColumnByName(cell) == null) {
            Column column = new Column(project.columnModel.allocateNewCellIndex(), cell);
            try {
                project.columnModel.addColumn(project.columnModel.columns.size(), column, false);
            } catch (ModelException e) {
            }
        }
    });