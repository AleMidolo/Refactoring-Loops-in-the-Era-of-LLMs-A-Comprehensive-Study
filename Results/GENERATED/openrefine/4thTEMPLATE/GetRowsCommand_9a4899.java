record.stream()
    .map(r -> project.rows.get(r))
    .map(row -> new WrappedRow(row, record.fromRowIndex, r == record.fromRowIndex ? record.recordIndex : null, sortedStartRowIndex + r - record.fromRowIndex))
    .forEach(results::add);