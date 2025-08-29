for (CachedPath path : unmodified.values()) {
    Files.createDirectories(context.outputPath().resolve(path.getSourcePath()).getParent());
    Files.copy(context.lastSuccessfulOutput().get().resolve(path.getSourcePath()), context.outputPath().resolve(path.getSourcePath()));
}