rowIdToEditLink.entrySet().stream()
    .filter(editLinkCell -> rowIdToError.get(editLinkCell.getKey()) == null)
    .forEach(editLinkCell -> cells.add(new CellAtRow(editLinkCell.getKey(), new Cell(editLinkCell.getValue(), null)));