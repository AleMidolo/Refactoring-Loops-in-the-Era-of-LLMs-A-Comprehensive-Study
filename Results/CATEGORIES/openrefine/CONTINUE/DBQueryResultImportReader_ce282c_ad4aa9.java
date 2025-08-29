for (int j = 0; j < row.size() && j < dbColumns.size(); j++) {
    String text = row.get(j);
    if (text == null || text.isEmpty()) {
        rowOfCells.add(null);
    } else {
        DatabaseColumn col = dbColumns.get(j);
        if (col.getType() == DatabaseColumnType.NUMBER) {
            try {
                rowOfCells.add(Long.parseLong(text));
                continue;
            } catch (NumberFormatException e) {
            }
        } else if (col.getType() == DatabaseColumnType.DOUBLE || col.getType() == DatabaseColumnType.FLOAT) {
            try {
                double d = Double.parseDouble(text);
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    rowOfCells.add(d);
                    continue;
                }
            } catch (NumberFormatException e) {
            }
        }
        rowOfCells.add(text);
    }
}