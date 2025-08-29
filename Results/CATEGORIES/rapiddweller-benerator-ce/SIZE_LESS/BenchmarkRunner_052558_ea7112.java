for (SystemRef system : systems) {
    if (system.isDb()) {
        runBenchmarkOnEnvironment(benchmark, system, summary);
    }
}