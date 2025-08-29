IntStream.range(0, n)
         .forEach(i -> counter.count(getRandom().randomFromWeightLiteral("'A'^2,'B'^1")));