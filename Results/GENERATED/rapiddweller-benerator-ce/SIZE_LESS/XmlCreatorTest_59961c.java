IntStream.range(0, 10)
    .mapToObj(i -> createXMLFile(ENUM_FILE, "address", "target/enum.xml"))
    .map(Document::getDocumentElement)
    .map(address -> address.getAttribute("box"))
    .forEach(box -> assertTrue("".equals(box) || "0203".equals(box));