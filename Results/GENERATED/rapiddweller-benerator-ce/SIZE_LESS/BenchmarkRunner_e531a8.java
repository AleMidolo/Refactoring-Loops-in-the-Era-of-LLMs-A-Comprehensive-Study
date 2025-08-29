systems.stream()
       .filter(SystemRef::isKafka)
       .forEach(system -> runBenchmarkOnEnvironment(benchmark, system, summary));