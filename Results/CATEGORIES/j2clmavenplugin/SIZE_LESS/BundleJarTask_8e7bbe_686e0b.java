for (CachedPath bundle : jsSources.stream().flatMap(i -> i.getFilesAndHashes().stream()).collect(Collectors.toUnmodifiableList())) {
    Path targetFile = outputDir.toPath().resolve(bundle.getSourcePath());
    if (Files.exists(targetFile) && Files.size(targetFile) == Files.size(bundle.getAbsolutePath())) {
        continue;
    }
    Files.copy(bundle.getAbsolutePath(), targetFile, StandardCopyOption.REPLACE_EXISTING);
}