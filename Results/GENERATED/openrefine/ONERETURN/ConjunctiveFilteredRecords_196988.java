project.recordModel.getRecords()
        .stream()
        .filter(record -> matchRecord(project, record))
        .forEach(record -> {
            if (visitor.visit(project, record.fromRowIndex, record)) {
                return;
            }
        });