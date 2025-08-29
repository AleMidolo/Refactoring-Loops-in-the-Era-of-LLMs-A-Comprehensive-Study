IntStream.range(0, featureDetails.length)
    .filter(i -> i % 2 == 0)
    .forEach(i -> {
        String feature = featureDetails[i];
        String value = featureDetails[i + 1];
        if (componentFeatures.contains(feature)) {
            if (!"type".equals(feature)) {
                part.setDetailValue(feature, value);
            }
        } else {
            type.setDetailValue(feature, value);
        }
});