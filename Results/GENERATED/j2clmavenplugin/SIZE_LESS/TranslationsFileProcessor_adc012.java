children.stream()
    .filter(node -> node.getNodeName().equals("translation"))
    .forEach(node -> {
        String key = node.getAttributes().getNamedItem("id").getNodeValue();
        resultedCodeSet.put(key, node);
    });