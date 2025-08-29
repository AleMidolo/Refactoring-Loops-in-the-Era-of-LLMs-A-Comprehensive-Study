for (int i = 0; i < 10; i++) {
    Document doc = createXMLFile(CARDINALITY_FILE, "outer", "target/cardinalities.xml");
    Element outer = doc.getDocumentElement();
    Element[] inners = XMLUtil.getChildElements(outer);
    assertTrue("Expected 3-5 inners, found: " + inners.length, inners.length >= 3 && inners.length <= 5);
}