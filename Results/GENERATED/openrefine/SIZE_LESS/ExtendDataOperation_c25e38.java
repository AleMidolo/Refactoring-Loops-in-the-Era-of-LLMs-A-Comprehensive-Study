_job.columns.stream()
    .map(info -> info.name)
    .forEach(columnNames::add);