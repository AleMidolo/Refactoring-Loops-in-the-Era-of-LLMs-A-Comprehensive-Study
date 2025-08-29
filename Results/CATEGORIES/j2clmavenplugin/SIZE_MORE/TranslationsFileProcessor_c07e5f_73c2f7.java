for (File xtb : xtbFiles) {
    Document doc = db.parse(xtb);
    doc.getDocumentElement().normalize();
    NodeList translationbundleNode = doc.getElementsByTagName("translationbundle");
    if (translationbundleNode.getLength() == 0) {
        throw new RuntimeException(String.format("%s file has no translationbundle declaration", xtb));
    }
    String lang = translationbundleNode.item(0).getAttributes().getNamedItem("lang").getNodeValue();
    if (locales.contains(lang)) {
        suitableFiles.computeIfAbsent(lang, k -> new HashSet<>()).add(translationbundleNode);
    }
}