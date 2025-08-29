for (int i = 0; i < featureDetails.length; i += 2) {
    if ("type".equals(featureDetails[i])) {
        typeName = featureDetails[i + 1];
    }
}