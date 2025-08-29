groups.forEach(g -> {
    String keyColName = columnModel.getColumnByCellIndex(g.keyCellIndex).getName();
    String result = g.cellIndices.stream()
        .map(ci -> columnModel.getColumnByCellIndex(ci))
        .filter(Objects::nonNull)
        .map(Column::getName)
        .collect(Collectors.joining(","));
    logger.trace("KeyedGroup " + keyColName + "::" + result);
});