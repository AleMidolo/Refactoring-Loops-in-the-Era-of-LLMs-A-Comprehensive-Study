for (String rowStr : data) {
    Row row = Row.load(rowStr, pool);
    if (!Objects.equals(rowStr, "{}")) {
        throw new IllegalArgumentException("Row is not empty");
    }
    rows.add(row);
}