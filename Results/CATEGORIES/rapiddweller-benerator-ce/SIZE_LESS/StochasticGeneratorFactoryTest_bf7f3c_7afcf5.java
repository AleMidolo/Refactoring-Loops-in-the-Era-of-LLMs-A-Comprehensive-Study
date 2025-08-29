for (WeightFunction function : getDistributionFunctions(min.doubleValue(), max.doubleValue())) {
    checkNumberGenerator(type, min, max, granularity, function);
}