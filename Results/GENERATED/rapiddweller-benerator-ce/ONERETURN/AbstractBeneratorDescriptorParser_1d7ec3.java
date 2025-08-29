return parentPath.stream()
    .anyMatch(this::isLoop);