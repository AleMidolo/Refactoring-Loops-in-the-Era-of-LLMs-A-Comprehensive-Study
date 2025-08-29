Collections.list(zipInputFile.entries()).stream()
    .filter(z -> !z.isDirectory())
    .forEach(z -> {
        Path outPath = context.outputPath().resolve(z.getName());
        try (InputStream inputStream = zipInputFile.getInputStream(z)) {
            Files.createDirectories(outPath.getParent());
            Files.copy(inputStream, outPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    });