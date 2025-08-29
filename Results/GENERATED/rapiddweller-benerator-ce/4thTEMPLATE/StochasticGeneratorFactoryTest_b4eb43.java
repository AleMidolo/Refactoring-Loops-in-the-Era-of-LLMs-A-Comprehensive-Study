getDistributionFunctions(min.getTime(), max.getTime())
    .stream()
    .map(distributionFunction -> generatorFactory.createDateGenerator(min, max, Period.DAY.getMillis(), distributionFunction))
    .forEach(this::initAndUseGenerator);