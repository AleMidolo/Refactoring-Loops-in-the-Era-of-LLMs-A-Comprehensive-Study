g.cellIndices.stream()
    .map(ci -> columnModel.getColumnByCellIndex(ci))
    .filter(col -> col != null)
    .forEach(col -> sb.append(col.getName()).append(','));