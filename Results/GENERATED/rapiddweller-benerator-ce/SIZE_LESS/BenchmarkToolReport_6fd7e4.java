config.getSystems().stream()
    .filter(candidate -> candidate.getType().equals(type))
    .forEach(result::add);