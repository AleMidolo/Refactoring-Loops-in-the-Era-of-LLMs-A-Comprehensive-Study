for (ZipEntry z : Collections.list(zipInputFile.entries())) {
    if (z.isDirectory()) {
        continue;
    }
    Path outPath = context.outputPath().resolve(z.getName());
    try (InputStream inputStream = zipInputFile.getInputStream(z)) {
        Files.createDirectories(outPath.getParent());
        Files.copy(inputStream, outPath);
    }
}