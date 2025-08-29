for (SystemRef system : systems) {
    if (system.isKafka()) {
        runBenchmarkOnEnvironment(benchmark, system, summary);
    }
}