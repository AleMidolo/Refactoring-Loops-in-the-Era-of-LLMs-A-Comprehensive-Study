Arrays.stream(featureDetails)
    .filter((element, index) -> index % 2 == 0 && "type".equals(element))
    .findFirst()
    .ifPresent(type -> typeName = featureDetails[Arrays.asList(featureDetails).indexOf(type) + 1]);