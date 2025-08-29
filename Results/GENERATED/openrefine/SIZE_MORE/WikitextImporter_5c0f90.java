origRow.stream()
    .forEach(i -> {
        Recon recon = null;
        if (currentRow >= 0 && reconList != null) {
            recon = reconList.get(currentRow).get(i);
        }
        String value = origRow.get(i);
        row.add(value != null ? new Cell(value, recon) : null);
        if (columnReferenced != null && i < columnReferenced.size() && columnReferenced.get(i)) {
            String refValue = (currentRow == -1) ? origRow.get(i) + "_ref" : refRow.get(i);
            row.add(refValue != null ? new Cell(refValue, null) : null);
        }
    });