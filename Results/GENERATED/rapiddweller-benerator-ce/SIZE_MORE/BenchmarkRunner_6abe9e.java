generatedFiles.stream()
    .peek(generatedFile -> {
        if (logger.isInfoEnabled()) {
            logger.info("Generated file {} is {} large", generatedFile, HF.formatByteSize(generatedFile.length()));
        }
    })
    .filter(generatedFile -> generatedFile.length() > maxFileSize.get())
    .forEach(generatedFile -> maxFileSize.set(generatedFile.length()));