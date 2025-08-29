for (int n = 1; n < 5; n++) {
    UniqueScrambledStringGenerator generator = new UniqueScrambledStringGenerator(CollectionUtil.toSet('0', '1'), n, n + 1);
    generator.init(new DefaultBeneratorContext());
    for (int i = 0; i < 30; i++) {
        int exp = (int) Math.round(Math.pow(2, n)) + (int) Math.round(Math.pow(2, n + 1));
        for (int c = 0; c < exp; c++) {
            assertNotNull(generator.generate());
        }
        assertNull(generator.generate());
        generator.reset();
    }
}