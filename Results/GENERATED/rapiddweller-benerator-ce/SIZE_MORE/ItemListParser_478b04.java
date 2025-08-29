XMLUtil.getChildElements(element).stream()
    .map(XMLUtil::localName)
    .forEach(childElementName -> {
        if (EL_PART.equals(childElementName)) {
            modelParser.getPartParser().parse(childElement, owner, null);
        } else if (ModelParser.isSimpleTypeComponent(childElementName)) {
            modelParser.parseSimpleTypeComponent(childElement, owner, null);
        } else if (EL_LIST.equals(childElementName)) {
            modelParser.getItemListParser().parse(childElement, owner);
        } else {
            throw BeneratorExceptionFactory.getInstance().configurationError("Expected one of these element names: " + EL_ATTRIBUTE + ", " + EL_ID + ", " + EL_REFERENCE + ", " + EL_LIST + ", or " + EL_PART + ". Found: " + childElementName);
        }
    });