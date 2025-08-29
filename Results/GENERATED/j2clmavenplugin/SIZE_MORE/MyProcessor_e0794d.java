return Arrays.stream(new JavaFileManager.Location[] { StandardLocation.SOURCE_PATH, StandardLocation.SOURCE_OUTPUT, StandardLocation.CLASS_PATH, StandardLocation.CLASS_OUTPUT, StandardLocation.ANNOTATION_PROCESSOR_PATH })
        .map(location -> {
            try {
                FileObject resource = filer.getResource(location, "", path);
                if (resource != null && new File(resource.getName()).exists()) {
                    return resource.getCharContent(false);
                }
            } catch (IOException e) {
            }
            return null;
        })
        .filter(Objects::nonNull)
        .findFirst()
        .orElse(null);