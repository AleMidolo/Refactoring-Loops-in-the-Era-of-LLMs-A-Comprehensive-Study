for (WeightedSample<?> sample : samples) {
    generator.addSample(NumberToNumberConverter.convert((Number) sample.getValue(), numberType), sample.getWeight());
}