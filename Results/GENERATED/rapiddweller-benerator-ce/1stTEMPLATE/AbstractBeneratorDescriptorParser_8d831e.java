return parentPath.stream()
        .anyMatch(statement -> statement instanceof GenIterStatement);