project.rows.stream()
    .skip(record.fromRowIndex)
    .limit(record.toRowIndex - record.fromRowIndex)
    .forEach(r -> results.add(new WrappedRow(r, r, r == record.fromRowIndex ? record.recordIndex : null, sortedStartRowIndex + r - record.fromRowIndex));