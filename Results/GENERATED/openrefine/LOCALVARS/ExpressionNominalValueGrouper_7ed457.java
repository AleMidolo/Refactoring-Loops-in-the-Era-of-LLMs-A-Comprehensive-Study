project.rows.subList(record.fromRowIndex, record.toRowIndex).stream()
        .peek(row -> {
            hasError = false;
            hasBlank = false;
            visitRow(project, row, bindings, record.recordIndex);
        })
        .filter(row -> hasError)
        .forEach(row -> errorCount++);
project.rows.subList(record.fromRowIndex, record.toRowIndex).stream()
        .filter(row -> hasBlank)
        .forEach(row -> blankCount++);