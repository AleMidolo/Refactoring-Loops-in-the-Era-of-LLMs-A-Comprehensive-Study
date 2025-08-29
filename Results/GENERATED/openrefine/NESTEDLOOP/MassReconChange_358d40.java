project.rows.stream()
    .forEach(row -> IntStream.range(0, row.cells.size())
        .forEach(c -> {
            Cell cell = row.cells.get(c);
            if (cell != null && cell.recon != null) {
                Recon recon = cell.recon;
                reconMap.entrySet().stream()
                    .filter(entry -> entry.getKey().equals(recon.id))
                    .findAny().ifPresent(entry -> {
                        String columnName = project.columnModel.getColumnByCellIndex(c).getName();
                        if (!flushedColumn.contains(columnName)) {
                            ProjectManager.singleton.getLookupCacheManager().flushLookupsInvolvingProjectColumn(project.id, columnName);
                            flushedColumn.add(columnName);
                        }
                        row.setCell(c, new Cell(cell.value, entry.getValue()));
                    });
            }
        })
    );