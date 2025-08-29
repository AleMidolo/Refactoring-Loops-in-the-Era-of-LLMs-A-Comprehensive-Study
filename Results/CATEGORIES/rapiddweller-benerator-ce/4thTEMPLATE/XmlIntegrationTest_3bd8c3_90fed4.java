for (int i = 0; i < names.getLength(); i++) {
    String name = names.item(i).getTextContent();
    assertTrue("Not an anonymized name: " + name, anonNames.contains(name));
}