for (Benchmark setup : Benchmark.getInstances()) {
    ConsolePrinter.printStandard(setup.getName() + ": " + setup.getDescription());
}