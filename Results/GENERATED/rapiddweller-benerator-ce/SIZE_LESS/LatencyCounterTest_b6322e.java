IntStream.rangeClosed(25, 1025)
    .filter(i -> i % 25 == 0)
    .forEach(counter::addSample);