XMLUtil.getChildElements(idXml.getDocumentElement())
    .forEach(child -> parser.parse(child, parentXmlPath, parentComponentPath, parseContext));