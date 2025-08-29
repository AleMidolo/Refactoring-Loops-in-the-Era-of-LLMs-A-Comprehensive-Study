for (int ci : g.cellIndices) {
    Column col = columnModel.getColumnByCellIndex(ci);
    if (col != null) {
        sb.append(col.getName()).append(',');
    }
}