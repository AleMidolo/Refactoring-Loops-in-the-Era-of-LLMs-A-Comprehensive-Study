entries.stream()
        .filter(entry -> artifactPattern.matcher(entry.getFileName().toString()).matches())
        .forEach(entry -> {
            recursivelyDeleteDir(entry);
            getLog().info("Deleted directory " + entry);
        });