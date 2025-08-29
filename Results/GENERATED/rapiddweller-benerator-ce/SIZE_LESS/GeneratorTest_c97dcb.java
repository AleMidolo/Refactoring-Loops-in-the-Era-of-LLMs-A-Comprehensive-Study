validators.stream()
    .filter(validator -> validator instanceof Resettable)
    .map(validator -> (Resettable) validator)
    .forEach(Resettable::reset);