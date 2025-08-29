rowIdToEditLink.entrySet().stream()
    .filter(editLinkCell -> rowIdToError.get(editLinkCell.getKey()) == null)
    .map(editLinkCell -> new CellAtRow(editLinkCell.getKey(), new Cell(editLinkCell.getValue(), null)))
    .forEach(cells::add);