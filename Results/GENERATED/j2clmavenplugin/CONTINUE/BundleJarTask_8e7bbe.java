jsSources.stream()
         .flatMap(i -> i.getFilesAndHashes().stream())
         .collect(Collectors.toUnmodifiableList())
         .forEach(bundle -> {
            Path targetFile = outputDir.toPath().resolve(bundle.getSourcePath());
            if (Files.exists(targetFile) && Files.size(targetFile) == Files.size(bundle.getAbsolutePath())) {
                return;
            }
            Files.copy(bundle.getAbsolutePath(), targetFile, StandardCopyOption.REPLACE_EXISTING);
});