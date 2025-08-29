return IntStream.range(record.fromRowIndex, record.toRowIndex)
        .anyMatch(r -> _rowFilter.filterRow(project, r, project.rows.get(r)));