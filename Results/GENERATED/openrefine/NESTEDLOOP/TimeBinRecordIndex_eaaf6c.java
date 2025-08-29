IntStream.range(0, count)
    .mapToObj(r -> project.recordModel.getRecord(r))
    .peek(record -> preprocessing())
    .forEach(record -> IntStream.range(record.fromRowIndex, record.toRowIndex)
        .mapToObj(i -> project.rows.get(i))
        .forEach(row -> processRow(project, rowEvaluable, allValues, i, row, bindings)));
postprocessing();