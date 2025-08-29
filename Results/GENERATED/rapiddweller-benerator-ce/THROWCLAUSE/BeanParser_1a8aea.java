propertyElements.stream()
    .filter(propertyElement -> !EL_PROPERTY.equals(propertyElement.getNodeName()))
    .forEach(propertyElement -> {
        throw ExceptionFactory.getInstance().syntaxErrorForXmlElement("not a supported bean child element", propertyElement);
    });