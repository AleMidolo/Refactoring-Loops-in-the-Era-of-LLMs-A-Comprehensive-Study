systems.stream()
    .forEach(system -> printer.printStd("- " + system.getEnvironment().getName() + "#" + system.getName() + " - " + describe(system)));