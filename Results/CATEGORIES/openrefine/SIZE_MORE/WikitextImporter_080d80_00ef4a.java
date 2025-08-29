for (int i = 0; i < origRow.size(); i++) {
    Recon recon = null;
    if (currentRow >= 0 && reconList != null) {
        recon = reconList.get(currentRow).get(i);
    }
    String value = origRow.get(i);
    if (value != null) {
        row.add(new Cell(value, recon));
    } else {
        row.add(null);
    }
    if (columnReferenced != null && i < columnReferenced.size() && columnReferenced.get(i)) {
        String refValue = null;
        if (currentRow == -1) {
            refValue = origRow.get(i) + "_ref";
        } else {
            refValue = refRow.get(i);
        }
        if (refValue != null) {
            row.add(new Cell(refValue, null));
        } else {
            row.add(null);
        }
    }
}