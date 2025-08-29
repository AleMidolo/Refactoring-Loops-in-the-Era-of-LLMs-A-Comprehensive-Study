getDistributionFunctions(min.doubleValue(), max.doubleValue())
        .forEach(function -> checkNumberGenerator(type, min, max, granularity, function));