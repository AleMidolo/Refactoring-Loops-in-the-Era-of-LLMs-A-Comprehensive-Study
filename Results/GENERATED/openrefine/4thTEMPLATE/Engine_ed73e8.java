IntStream.range(0, c)
    .mapToObj(r -> project.recordModel.getRecord(r))
    .forEach(record -> visitor.visit(project, record.fromRowIndex, record));