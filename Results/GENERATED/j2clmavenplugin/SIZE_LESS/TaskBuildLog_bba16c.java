suppressed.stream()
    .forEach(throwable -> printStackTrace(throwable, indent + "\t", "Suppressed: ", seen));