IntStream.range(0, count)
    .mapToObj(columnOptionArray::get)
    .filter(Objects::nonNull)
    .map(columnOptions -> JSONUtilities.getString(columnOptions, "name", null))
    .filter(Objects::nonNull)
    .forEach(name -> {
        columnNames.add(name);
        try {
            columnNameToFormatter.put(name, ParsingUtilities.mapper.treeToValue(columnOptions, ColumnOptions.class));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    });