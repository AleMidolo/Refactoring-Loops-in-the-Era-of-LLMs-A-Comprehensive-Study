IntStream.range(0, sampleCount)
    .forEach(i -> {
        double weight = samples[i].getWeight();
        if (weight < 0) {
            throw BeneratorExceptionFactory.getInstance().illegalArgument("Negative weight in literal: " + literal);
        }
        sum += weight;
        probSum[i] = (float) sum;
    });