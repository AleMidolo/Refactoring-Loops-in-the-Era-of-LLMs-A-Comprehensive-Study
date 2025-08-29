for (SystemRef system : systems) {
    printer.printStd("- " + system.getEnvironment().getName() + "#" + system.getName() + " - " + describe(system));
}