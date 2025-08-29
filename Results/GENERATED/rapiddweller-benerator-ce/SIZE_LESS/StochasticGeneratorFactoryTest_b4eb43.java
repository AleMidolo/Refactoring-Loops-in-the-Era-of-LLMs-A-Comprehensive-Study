getDistributionFunctions(min.getTime(), max.getTime())
    .stream()
    .forEach(distributionFunction -> {
        Generator<Date> generator = generatorFactory.createDateGenerator(min, max, Period.DAY.getMillis(), distributionFunction);
        initAndUseGenerator(generator);
    });