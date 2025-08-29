subjectToRows.entrySet().stream()
    .map(Entry::getValue)
    .forEach(project.rows::addAll);