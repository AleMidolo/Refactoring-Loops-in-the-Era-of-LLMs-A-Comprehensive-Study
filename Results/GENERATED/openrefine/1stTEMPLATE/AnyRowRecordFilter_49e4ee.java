record.rows.subList(record.fromRowIndex, record.toRowIndex).stream()
    .anyMatch(r -> _rowFilter.filterRow(project, r, project.rows.get(r)));