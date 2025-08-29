groups.stream()
        .forEach(g -> {
            String keyColName = columnModel.getColumnByCellIndex(g.keyCellIndex).getName();
            String sb = g.cellIndices.stream()
                    .mapToObj(ci -> columnModel.getColumnByCellIndex(ci))
                    .filter(Objects::nonNull)
                    .map(Column::getName)
                    .collect(Collectors.joining(","));
            logger.trace("KeyedGroup " + keyColName + "::" + sb);
        });