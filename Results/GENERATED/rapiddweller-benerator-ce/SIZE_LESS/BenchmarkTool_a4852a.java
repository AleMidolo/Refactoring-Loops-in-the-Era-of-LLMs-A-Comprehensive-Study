Benchmark.getInstances().stream()
    .forEach(setup -> ConsolePrinter.printStandard(setup.getName() + ": " + setup.getDescription()));