sourcePath.stream()
        .filter(path -> {
            if (!seenPublic) {
                if (path.equals(PUBLIC)) {
                    seenPublic = true;
                }
                return false;
            }
            return true;
        })
        .forEach(path -> dir.add(path.toString()));