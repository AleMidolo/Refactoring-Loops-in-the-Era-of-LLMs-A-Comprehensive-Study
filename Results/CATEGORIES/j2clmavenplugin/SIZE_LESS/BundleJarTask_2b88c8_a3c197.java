for (CachedPath entry : input.getFilesAndHashes()) {
    copiedOutputPath(outputDir.toPath(), entry);
}