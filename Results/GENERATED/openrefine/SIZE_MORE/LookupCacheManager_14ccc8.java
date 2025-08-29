IntStream.range(0, count)
    .forEach(r -> {
        Row targetRow = targetProject.rows.get(r);
        Object value = targetRow.getCellValue(targetColumn.getCellIndex());
        if (ExpressionUtils.isNonBlankData(value)) {
            String valueStr = value.toString();
            lookup.valueToRowIndices.putIfAbsent(valueStr, new ArrayList<>());
            lookup.valueToRowIndices.get(valueStr).add(r);
        }
    });