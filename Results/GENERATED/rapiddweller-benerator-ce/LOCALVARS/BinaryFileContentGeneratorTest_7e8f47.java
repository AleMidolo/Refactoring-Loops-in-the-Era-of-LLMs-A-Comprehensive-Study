IntStream.range(0, 20)
        .forEach(i -> {
            byte[] product = generator.generate();
            if (Arrays.equals(ROOT_DIR_FILE_CONTENT_ARRAY, product)) {
                rootFileUsed = true;
            } else if (Arrays.equals(SUB_DIR_FILE_CONTENT_ARRAY, product)) {
                subFileUsed = true;
            } else {
                fail("Unexpected product: " + ArrayFormat.formatBytes(", ", product));
            }
        });