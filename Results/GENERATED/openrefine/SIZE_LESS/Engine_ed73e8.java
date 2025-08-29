project.recordModel.getRecords()
    .limit(c)
    .forEach(record -> visitor.visit(project, record.fromRowIndex, record));