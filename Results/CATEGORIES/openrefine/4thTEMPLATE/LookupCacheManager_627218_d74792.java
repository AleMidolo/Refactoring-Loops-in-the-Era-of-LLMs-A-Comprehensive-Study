for (Integer r : valueToRowIndices.get(valueStr)) {
    Row row = targetProject.rows.get(r);
    rows.add(new WrappedRow(targetProject, r, row));
}