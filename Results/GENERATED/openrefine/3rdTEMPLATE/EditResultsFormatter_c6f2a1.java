rowIdToEditLink.entrySet().stream()
        .filter(entry -> rowIdToError.get(entry.getKey()) == null)
        .map(entry -> new CellAtRow(entry.getKey(), new Cell(entry.getValue(), null)))
        .forEach(cells::add);