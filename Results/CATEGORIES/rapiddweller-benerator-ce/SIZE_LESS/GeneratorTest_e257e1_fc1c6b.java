for (int i = 0; i < nameValuePairs.length; i += 2) {
    String name = (String) nameValuePairs[i];
    Object expected = nameValuePairs[i + 1];
    Object actual = entity.getComponent(name);
    assertEquals("Unexpected value for component '" + name + "':", expected, actual);
}