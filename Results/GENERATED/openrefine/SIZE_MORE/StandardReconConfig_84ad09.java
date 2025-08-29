columnDetails.stream()
    .forEach(c -> {
        int detailCellIndex = project.columnModel.getColumnByName(c.columnName).getCellIndex();
        Cell cell2 = row.getCell(detailCellIndex);
        if (cell2 == null || !ExpressionUtils.isNonBlankData(cell2.value)) {
            int cellIndex = project.columnModel.getColumnByName(columnName).getCellIndex();
            RowDependency rd = project.recordModel.getRowDependency(rowIndex);
            if (rd != null && rd.cellDependencies != null) {
                int contextRowIndex = rd.cellDependencies[cellIndex].rowIndex;
                if (contextRowIndex >= 0 && contextRowIndex < project.rows.size()) {
                    Row row2 = project.rows.get(contextRowIndex);
                    cell2 = row2.getCell(detailCellIndex);
                }
            }
        }
        if (cell2 != null && ExpressionUtils.isNonBlankData(cell2.value)) {
            Object v;
            if (cell2.recon != null && cell2.recon.match != null) {
                Map<String, String> recon = new HashMap<>();
                recon.put("id", cell2.recon.match.id);
                recon.put("name", cell2.recon.match.name);
                v = recon;
            } else {
                v = cell2.value;
            }
            properties.add(new QueryProperty(c.propertyID, v));
        }
    });