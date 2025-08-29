for (String filename : files) {
    File file = new File(context.resolveRelativeUri(filename));
    if (file.exists()) {
        try {
            if (!file.delete()) {
                errorHandler.handleError("File could not be deleted: " + filename + ". " + "Probably it is locked.");
            }
        } catch (Exception e) {
            errorHandler.handleError("Error deleting file " + file);
        }
    } else {
        errorHandler.handleError("File not found: " + file);
    }
}