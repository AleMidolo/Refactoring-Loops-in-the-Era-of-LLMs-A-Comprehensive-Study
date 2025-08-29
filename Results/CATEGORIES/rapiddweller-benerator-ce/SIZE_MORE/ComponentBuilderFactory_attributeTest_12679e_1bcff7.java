for (int i = 0; i < featureDetails.length; i += 2) {
    String feature = featureDetails[i];
    String value = featureDetails[i + 1];
    if (componentFeatures.contains(feature)) {
        if (!"type".equals(feature)) {
            part.setDetailValue(feature, value);
        }
    } else {
        type.setDetailValue(feature, value);
    }
}