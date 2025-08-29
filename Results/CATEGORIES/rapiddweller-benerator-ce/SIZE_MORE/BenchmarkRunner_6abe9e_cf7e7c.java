for (File generatedFile : generatedFiles) {
    if (logger.isInfoEnabled()) {
        logger.info("Generated file {} is {} large", generatedFile, HF.formatByteSize(generatedFile.length()));
    }
    if (generatedFile.length() > maxFileSize.get()) {
        maxFileSize.set(generatedFile.length());
    }
}