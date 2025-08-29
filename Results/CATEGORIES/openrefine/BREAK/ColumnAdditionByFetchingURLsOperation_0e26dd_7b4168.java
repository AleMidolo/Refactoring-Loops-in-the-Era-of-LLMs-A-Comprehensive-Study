for (CellAtRow urlData : urls) {
    String urlString = urlData.cell.value.toString();
    Serializable response = null;
    if (_urlCache != null) {
        response = cachedFetch(urlString);
    } else {
        response = fetch(urlString, httpHeaders);
    }
    if (response != null) {
        CellAtRow cellAtRow = new CellAtRow(urlData.row, new Cell(response, null));
        responseBodies.add(cellAtRow);
    }
    _progress = i++ * 100 / count;
    if (_canceled) {
        break;
    }
}