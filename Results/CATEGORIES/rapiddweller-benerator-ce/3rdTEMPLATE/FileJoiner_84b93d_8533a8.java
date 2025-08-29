for (String source : sources) {
    File file = new File(source);
    if (!file.delete()) {
        errorHandler.handleError("File could not be deleted: " + file + ". " + "Probably it is locked");
    }
}