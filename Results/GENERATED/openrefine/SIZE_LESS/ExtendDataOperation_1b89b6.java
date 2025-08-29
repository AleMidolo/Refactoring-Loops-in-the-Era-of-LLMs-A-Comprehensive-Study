_job.columns.stream()
    .map(ColumnInfo::getName)
    .forEach(columnNames::add);