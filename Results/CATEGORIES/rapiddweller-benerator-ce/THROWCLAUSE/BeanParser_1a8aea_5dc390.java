for (Element propertyElement : propertyElements) {
    if (!EL_PROPERTY.equals(propertyElement.getNodeName())) {
        throw ExceptionFactory.getInstance().syntaxErrorForXmlElement("not a supported bean child element", propertyElement);
    }
    PROP_ATTR_INFO.validate(propertyElement);
}