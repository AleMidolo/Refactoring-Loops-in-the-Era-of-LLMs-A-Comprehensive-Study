dbRows.stream()
    .map(DatabaseRow::getValues)
    .map(row -> {
        List<Object> rowOfCells = new ArrayList<>(row.size());
        IntStream.range(0, Math.min(row.size(), dbColumns.size()))
            .forEach(j -> {
                String text = row.get(j);
                if (text == null || text.isEmpty()) {
                    rowOfCells.add(null);
                } else {
                    DatabaseColumn col = dbColumns.get(j);
                    if (col.getType() == DatabaseColumnType.NUMBER) {
                        try {
                            rowOfCells.add(Long.parseLong(text));
                            return;
                        } catch (NumberFormatException e) {
                        }
                    } else if (col.getType() == DatabaseColumnType.DOUBLE || col.getType() == DatabaseColumnType.FLOAT) {
                        try {
                            double d = Double.parseDouble(text);
                            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                                rowOfCells.add(d);
                                return;
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                    rowOfCells.add(text);
                }
            });
        return rowOfCells;
    })
    .forEach(rowsOfCells::add);