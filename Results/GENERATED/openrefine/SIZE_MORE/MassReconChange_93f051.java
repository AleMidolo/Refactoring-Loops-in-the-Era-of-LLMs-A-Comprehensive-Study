row.cells.stream()
    .filter(cell -> cell != null && cell.recon != null)
    .map(cell -> cell.recon)
    .filter(recon -> reconMap.containsKey(recon.id))
    .forEach(recon -> {
        String columnName = project.columnModel.getColumnByCellIndex(row.cells.indexOf(cell)).getName();
        if (!flushedColumn.contains(columnName)) {
            ProjectManager.singleton.getLookupCacheManager().flushLookupsInvolvingProjectColumn(project.id, columnName);
            flushedColumn.add(columnName);
        }
        row.setCell(row.cells.indexOf(cell), new Cell(cell.value, reconMap.get(recon.id)));
    });