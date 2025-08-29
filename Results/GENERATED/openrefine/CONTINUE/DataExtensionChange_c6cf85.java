_oldRows.stream()
        .limit(rowIndex)
        .map(Row::dup)
        .forEach(_newRows::add);
        
for (int index = 0; index < _rowIndices.size(); index++) {
    int rowIndex = _rowIndices.get(index);
    DataExtension dataExtension = _dataExtensions.get(index);
    
    Row firstNewRow = oldRow.dup();
    extendRow(firstNewRow, dataExtension, 0, reconMap);
    _newRows.add(firstNewRow);
    int r2 = r + 1;
    
    for (int subR = 1; subR < dataExtension.data.length && r2 < project.rows.size(); subR++) {
        Row oldRow2 = project.rows.get(r2);
        
        if (oldRow2.isCellBlank(cellIndex) && oldRow2.isCellBlank(keyCellIndex)) {
            Row newRow = oldRow2.dup();
            extendRow(newRow, dataExtension, subR, reconMap);
            _newRows.add(newRow);
            r2++;
            continue;
        }
        
        Row newRow = new Row(cellIndex + _columnNames.size());
        extendRow(newRow, dataExtension, subR, reconMap);
        _newRows.add(newRow);
    }
    
    r = r2 - 1;
}