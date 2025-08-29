environments.values().stream()
    .flatMap(environment -> Stream.concat(
            Stream.of("- " + environment.getName() + SystemInfo.LF),
            environment.getSystems().stream()
                    .map(system -> "  # " + system.getName() + ": " +
                            system.getType() + " - " + describe(system) + SystemInfo.LF)))
    .forEach(result::append);