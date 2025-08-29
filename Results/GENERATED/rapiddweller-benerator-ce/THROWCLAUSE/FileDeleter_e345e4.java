files.stream()
    .map(filename -> new File(context.resolveRelativeUri(filename)))
    .filter(File::exists)
    .forEach(file -> {
        try {
            if (!file.delete()) {
                errorHandler.handleError("File could not be deleted: " + file.getName() + ". Probably it is locked.");
            }
        } catch (Exception e) {
            errorHandler.handleError("Error deleting file " + file.getName());
        }
    });