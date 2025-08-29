for (CellData cellData : cells) {
    if (cellData != null) {
        if (cellData.text == null || cellData.text.isEmpty()) {
            values.add(new SqlData(cellData.columnName, "", ""));
        } else {
            values.add(new SqlData(cellData.columnName, cellData.value, cellData.text));
        }
    }
}