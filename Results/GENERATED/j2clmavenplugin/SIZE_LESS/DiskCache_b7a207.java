runningTasks.stream()
    .forEach(path -> deleteRecursively(path));