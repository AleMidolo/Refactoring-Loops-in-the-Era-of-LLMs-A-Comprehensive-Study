valueToRowIndices.get(valueStr).stream()
    .map(r -> targetProject.rows.get(r))
    .map(row -> new WrappedRow(targetProject, row))
    .forEach(rows::add);