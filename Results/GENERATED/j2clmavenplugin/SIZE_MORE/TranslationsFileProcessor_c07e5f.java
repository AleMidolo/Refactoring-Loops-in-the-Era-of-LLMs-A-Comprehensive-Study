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
                // Handle the exception if needed
                return null;
            }
        })
        .filter(Objects::nonNull)
        .filter(nodeList -> locales.contains(nodeList.item(0).getAttributes().getNamedItem("lang").getNodeValue()))
        .forEach(nodeList -> suitableFiles.computeIfAbsent(nodeList.item(0).getAttributes().getNamedItem("lang").getNodeValue(), k -> new HashSet<>()).add(nodeList));