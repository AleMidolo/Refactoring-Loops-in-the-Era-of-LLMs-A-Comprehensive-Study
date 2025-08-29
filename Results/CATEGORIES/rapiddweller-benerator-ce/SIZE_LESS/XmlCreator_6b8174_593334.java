for (long i = 0; i < fileCount; i++) {
    ProductWrapper<File> file = fileGenerator.generate(new ProductWrapper<>());
    if (file == null) {
        throw BeneratorExceptionFactory.getInstance().operationFailed("Unable to create the expected number of files. Created " + i + " of " + fileCount + " files", null);
    }
    logger.info("created file: {}", file);
}