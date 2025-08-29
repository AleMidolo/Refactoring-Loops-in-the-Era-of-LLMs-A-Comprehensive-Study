results = IntStream.range(record.fromRowIndex, record.toRowIndex)
        .mapToObj(r -> new WrappedRow(project.rows.get(r), r, r == record.fromRowIndex ? record.recordIndex : null, sortedStartRowIndex + r - record.fromRowIndex))
        .collect(Collectors.toList());