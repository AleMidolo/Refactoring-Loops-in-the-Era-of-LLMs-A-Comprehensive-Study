LongStream.range(0, fileCount)
        .mapToObj(i -> fileGenerator.generate(new ProductWrapper<>()))
        .peek(file -> {
            if (file == null) {
                throw BeneratorExceptionFactory.getInstance().operationFailed("Unable to create the expected number of files. Created " + i + " of " + fileCount + " files", null);
            }
            logger.info("created file: {}", file);
        })
        .count();