ukConstraints.stream()
    .filter(constraint -> constraint.getColumnNames().length == 1)
    .forEach(constraint -> descriptor.setUnique(true));
