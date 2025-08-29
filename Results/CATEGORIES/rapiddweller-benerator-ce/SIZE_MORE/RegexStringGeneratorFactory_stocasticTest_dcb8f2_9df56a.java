for (int i = 0; i < 20; i++) {
    String output = generator.generate();
    logger.debug("checking sample '" + output + "' against regex '" + regex + "'");
    if (!nullable) {
        assertNotNull(output);
    }
    if (regex == null) {
        assertNull(output);
    } else {
        if (regex.length() == 0) {
            assertEquals("", output);
        } else {
            assertTrue(message + output, Pattern.matches(regex, output));
        }
        assertTrue(output.length() >= minLength);
        if (maxLength != null) {
            assertTrue(output.length() <= maxLength);
        }
    }
}