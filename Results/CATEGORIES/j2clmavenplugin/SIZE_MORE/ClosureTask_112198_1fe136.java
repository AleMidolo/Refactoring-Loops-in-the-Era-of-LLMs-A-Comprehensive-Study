for (Path path : sourcePath) {
    if (!seenPublic) {
        if (path.equals(PUBLIC)) {
            seenPublic = true;
        }
        continue;
    }
    dir.add(path.toString());
}