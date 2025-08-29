unmodified.values().stream()
    .forEach(path -> {
        try {
            Files.createDirectories(context.outputPath().resolve(path.getSourcePath()).getParent());
            Files.copy(context.lastSuccessfulOutput().get().resolve(path.getSourcePath()), context.outputPath().resolve(path.getSourcePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    });