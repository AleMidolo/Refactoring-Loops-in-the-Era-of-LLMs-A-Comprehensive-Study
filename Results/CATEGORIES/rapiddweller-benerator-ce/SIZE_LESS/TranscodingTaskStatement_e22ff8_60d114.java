for (Element child : XMLUtil.getChildElements(idXml.getDocumentElement())) {
    parser.parse(child, parentXmlPath, parentComponentPath, parseContext);
}