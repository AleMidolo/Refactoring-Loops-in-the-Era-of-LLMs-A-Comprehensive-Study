for (Object[] test : cases) {
    assertEquals(ImportingUtilities.isCompressed(new File(ClassLoader.getSystemResource((String) test[0]).getFile())), test[1], "Wrong value for isCompressed of: " + test);
}