for (JavaFileManager.Location location : Arrays.asList(StandardLocation.SOURCE_PATH, StandardLocation.SOURCE_OUTPUT, StandardLocation.CLASS_PATH, StandardLocation.CLASS_OUTPUT, StandardLocation.ANNOTATION_PROCESSOR_PATH)) {
    try {
        FileObject resource = filer.getResource(location, "", path);
        if (resource != null && new File(resource.getName()).exists()) {
            return resource.getCharContent(false);
        }
    } catch (IOException e) {
    }
}