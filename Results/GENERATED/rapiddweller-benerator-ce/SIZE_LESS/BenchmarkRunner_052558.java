systems.stream()
            .filter(SystemRef::isDb)
            .forEach(system -> runBenchmarkOnEnvironment(benchmark, system, summary));