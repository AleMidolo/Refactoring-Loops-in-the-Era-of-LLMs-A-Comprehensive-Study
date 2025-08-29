samples.stream()
        .filter(sample -> sample.getValue() == null)
        .findFirst()
        .ifPresent(sample -> {
            throw BeneratorExceptionFactory.getInstance().configurationError("null is not supported in values='...', drop it from the list and use a nullQuota instead");
        });
        
samples.forEach(sample -> generator.addSample(sample.getValue(), sample.getWeight()));