urls.stream()
        .map(urlData -> urlData.cell.value.toString())
        .map(urlString -> _urlCache != null ? cachedFetch(urlString) : fetch(urlString, httpHeaders))
        .filter(Objects::nonNull)
        .map(response -> new CellAtRow(responseBodies.size(), new Cell(response, null)))
        .forEach(cellAtRow -> {
            responseBodies.add(cellAtRow);
            _progress = i++ * 100 / count;
            if (_canceled) {
                throw new BreakLoopException();
            }
        });