for (DatabaseRow dbRow : dbRows) {
    List<String> row = dbRow.getValues();
    List<Object> rowOfCells = new ArrayList<Object>(row.size());
    row.subList(0, Math.min(row.size(), dbColumns.size())).stream().map(text -> {
        if (text == null || text.isEmpty()) {
            return null;
        } else {
            DatabaseColumn col = dbColumns.get(row.indexOf(text));
            if (col.getType() == DatabaseColumnType.NUMBER) {
                try {
                    return Long.parseLong(text);
                } catch (NumberFormatException e) {
                }
            } else if (col.getType() == DatabaseColumnType.DOUBLE || col.getType() == DatabaseColumnType.FLOAT) {
                try {
                    double d = Double.parseDouble(text);
                    if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                        return d;
                    }
                } catch (NumberFormatException e) {
                }
            }
            return text;
        }
    }).forEach(rowOfCells::add);
    rowsOfCells.add(rowOfCells);
}