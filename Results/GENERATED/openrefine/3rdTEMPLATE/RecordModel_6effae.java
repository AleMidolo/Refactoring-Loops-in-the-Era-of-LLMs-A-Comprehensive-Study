g.cellIndices.stream()
                .map(columnModel::getColumnByCellIndex)
                .filter(Objects::nonNull)
                .map(Column::getName)
                .forEach(name -> sb.append(name).append(','));