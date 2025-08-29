record.rows.subList(record.fromRowIndex, record.toRowIndex)
    .stream()
    .allMatch(row -> _rowFilter.filterRow(project, row, project.rows.get(row)));