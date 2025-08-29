targetProject.rows.stream()
        .limit(count)
        .map(targetRow -> targetRow.getCellValue(targetColumn.getCellIndex()))
        .filter(value -> ExpressionUtils.isNonBlankData(value))
        .map(Object::toString)
        .forEach(valueStr -> {
            lookup.valueToRowIndices.putIfAbsent(valueStr, new ArrayList<>());
            lookup.valueToRowIndices.get(valueStr).add(targetProject.rows.indexOf(targetRow));
        });