project.recordModel.getRecords().stream()
    .limit(c)
    .forEach(record -> visitor.visit(project, record.fromRowIndex, record));