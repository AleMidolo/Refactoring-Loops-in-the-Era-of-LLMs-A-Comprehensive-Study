_job.columns.stream()
    .map(info -> info.expectedType)
    .forEach(columnTypes::add);