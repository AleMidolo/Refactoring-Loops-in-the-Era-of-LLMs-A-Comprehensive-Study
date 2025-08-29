valueToRowIndices.get(valueStr).stream()
    .map(r -> new WrappedRow(targetProject, r, targetProject.rows.get(r)))
    .forEach(rows::add);