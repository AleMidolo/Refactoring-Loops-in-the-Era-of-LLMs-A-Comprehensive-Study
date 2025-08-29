xtbFiles.stream()
    .map(xtb -> {
        try {
            Document doc = db.parse(xtb);
            doc.getDocumentElement().normalize();
            NodeList translationbundleNode = doc.getElementsByTagName("translationbundle");
            if (translationbundleNode.getLength() == 0) {
                throw new RuntimeException(String.format("%s file has no translationbundle declaration", xtb));
            }
            return translationbundleNode;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    })
    .filter(Objects::nonNull)
    .flatMap(nodeList -> {
        String lang = nodeList.item(0).getAttributes().getNamedItem("lang").getNodeValue();
        return locales.contains(lang) ? Stream.of(lang) : Stream.empty();
    })
    .forEach(lang -> suitableFiles.computeIfAbsent(lang, k -> new HashSet<>()).add(nodeList));