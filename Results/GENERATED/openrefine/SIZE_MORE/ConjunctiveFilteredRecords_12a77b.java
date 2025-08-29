project.recordModel.getRecords().stream()
    .limit(c)
    .filter(record -> matchRecord(project, record))
    .anyMatch(record -> visitor.visit(project, record.fromRowIndex, record));