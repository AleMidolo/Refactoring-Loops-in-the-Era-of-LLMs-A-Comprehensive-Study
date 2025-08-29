for (CachedPath entry : resources.getFilesAndHashes()) {
    Files.createDirectories(context.outputPath().resolve(entry.getSourcePath()).getParent());
    Files.copy(entry.getAbsolutePath(), context.outputPath().resolve(entry.getSourcePath()));
}