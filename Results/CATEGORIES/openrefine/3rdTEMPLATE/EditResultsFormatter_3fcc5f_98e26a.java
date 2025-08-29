for (Entry<Integer, String> editLinkCell : rowIdToEditLink.entrySet()) {
    int rowId = editLinkCell.getKey();
    if (rowIdToError.get(rowId) == null) {
        cells.add(new CellAtRow(rowId, new Cell(editLinkCell.getValue(), null)));
    }
}