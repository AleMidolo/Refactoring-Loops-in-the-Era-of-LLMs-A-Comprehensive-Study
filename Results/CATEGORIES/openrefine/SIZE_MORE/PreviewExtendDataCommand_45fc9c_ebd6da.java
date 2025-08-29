for (Object[] row : ext.data) {
    List<Object> jsonRow = new ArrayList<>();
    if (first) {
        jsonRow.add(topicName);
        first = false;
    } else {
        jsonRow.add(null);
    }
    for (Object cell : row) {
        jsonRow.add(cell);
    }
    rows.add(jsonRow);
}