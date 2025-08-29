Lists.reverse(_changes).stream()
    .forEach(change -> change.revert(project));