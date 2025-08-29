for (WeightFunction distributionFunction : getDistributionFunctions(min.getTime(), max.getTime())) {
    Generator<Date> generator = generatorFactory.createDateGenerator(min, max, Period.DAY.getMillis(), distributionFunction);
    initAndUseGenerator(generator);
}