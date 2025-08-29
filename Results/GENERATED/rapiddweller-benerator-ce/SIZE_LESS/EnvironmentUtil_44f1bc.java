environments.stream()
    .flatMap(environment -> environment.getSystems().stream())
    .filter(system -> type.equals(system.getType()))
    .forEach(result::add);