for (int i = 0; i < count; i++) {
    JsonNode columnOptions = columnOptionArray.get(i);
    if (columnOptions != null) {
        String name = JSONUtilities.getString(columnOptions, "name", null);
        if (name != null) {
            columnNames.add(name);
            try {
                columnNameToFormatter.put(name, ParsingUtilities.mapper.treeToValue(columnOptions, ColumnOptions.class));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }
}