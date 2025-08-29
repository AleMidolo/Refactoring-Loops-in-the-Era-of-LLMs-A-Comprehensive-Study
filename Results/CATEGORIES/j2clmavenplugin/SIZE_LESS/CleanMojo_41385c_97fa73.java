for (Path entry : entries) {
    if (artifactPattern.matcher(entry.getFileName().toString()).matches()) {
        recursivelyDeleteDir(entry);
        getLog().info("Deleted directory " + entry);
    }
}