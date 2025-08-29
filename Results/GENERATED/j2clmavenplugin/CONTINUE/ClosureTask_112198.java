seenPublic = sourcePath.stream()
        .filter(path -> !seenPublic && path.equals(PUBLIC))
        .peek(path -> seenPublic = true)
        .skip(seenPublic ? 0 : 1)
        .forEach(path -> dir.add(path.toString()));