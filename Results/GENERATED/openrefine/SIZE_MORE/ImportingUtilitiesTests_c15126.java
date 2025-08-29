Arrays.stream(suffixes)
    .map(suffix -> FILENAME_BASE + suffix)
    .map(filename -> {
        try {
            Path filePath = Paths.get(ClassLoader.getSystemResource(filename).toURI());
            File tmp = File.createTempFile("openrefine-test-" + FILENAME_BASE, suffix, job.getRawDataDir());
            tmp.deleteOnExit();
            byte[] contents = Files.readAllBytes(filePath);
            Files.write(tmp.toPath(), contents);
            Files.write(tmp.toPath(), contents, StandardOpenOption.APPEND);
            InputStream is = ImportingUtilities.tryOpenAsCompressedFile(tmp, null, null);
            Assert.assertNotNull(is, "Failed to open compressed file: " + filename);
            reader = new InputStreamReader(is);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            Assert.assertEquals(StreamSupport.stream(records.spliterator(), false).count(), LINES * 2, "row count mismatch for " + filename);
        } catch (Exception e) {
            // Handle exception as needed
        }
        return filename;
    })
    .collect(Collectors.toList());