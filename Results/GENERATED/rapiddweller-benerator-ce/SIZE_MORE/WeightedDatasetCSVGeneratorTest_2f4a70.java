IntStream.range(0, 100000)
    .takeWhile(i -> !mueller || !garcia)
    .mapToObj(i -> generator.generate())
    .filter(name -> "Müller".equals(name) || "García".equals(name))
    .forEach(name -> {
        if ("Müller".equals(name)) {
            mueller = true;
        }
        if ("García".equals(name)) {
            garcia = true;
        }
    });