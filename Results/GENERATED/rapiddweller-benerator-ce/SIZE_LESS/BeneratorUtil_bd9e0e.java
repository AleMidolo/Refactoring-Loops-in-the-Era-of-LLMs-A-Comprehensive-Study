environment.getSystems().stream()
    .map(system -> "  # " + system.getName() + ": " + system.getType() + " - " + describe(system) + SystemInfo.LF)
    .forEach(result::append);