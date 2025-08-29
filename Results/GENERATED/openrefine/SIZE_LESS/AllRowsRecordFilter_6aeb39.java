record.rows
        .stream()
        .skip(record.fromRowIndex)
        .limit(record.toRowIndex - record.fromRowIndex)
        .allMatch(row -> _rowFilter.filterRow(project, row, project.rows.get(row)));