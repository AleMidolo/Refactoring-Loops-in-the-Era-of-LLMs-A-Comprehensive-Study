project.recordModel.getRecords().stream()
        .limit(c)
        .forEach(record -> grouper.visit(project, record.fromRowIndex, record));