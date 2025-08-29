LongStream.range(0, fileCount)
    .mapToObj(i -> fileGenerator.generate(new ProductWrapper<>()))
    .filter(file -> file == null)
    .findFirst()
    .ifPresent(file -> {
        throw BeneratorExceptionFactory.getInstance().operationFailed("Unable to create the expected number of files. Created " + fileCount + " of " + fileCount + " files", null);
    });