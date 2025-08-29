for (int i = 0; i < children.getLength(); i++) {
    if (children.item(i).getNodeName().equals("translation")) {
        String key = children.item(i).getAttributes().getNamedItem("id").getNodeValue();
        resultedCodeSet.put(key, children.item(i));
    }
}