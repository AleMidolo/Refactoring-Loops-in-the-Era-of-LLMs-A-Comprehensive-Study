for (int i = 0; i < 10; i++) {
    Document doc = createXMLFile(ENUM_FILE, "address", "target/enum.xml");
    Element address = doc.getDocumentElement();
    String box = address.getAttribute("box");
    assertTrue("".equals(box) || "0203".equals(box));
}