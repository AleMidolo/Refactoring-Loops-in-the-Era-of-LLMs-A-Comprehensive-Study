record.indexes.stream()
        .forEach(r -> {
            hasError = false;
            hasBlank = false;
            Row row = project.rows.get(r);
            visitRow(project, r, row, bindings, record.recordIndex);
            if (hasError) {
                errorCount++;
            }
            if (hasBlank) {
                blankCount++;
        });
