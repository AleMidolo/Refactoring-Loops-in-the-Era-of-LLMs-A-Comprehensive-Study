key.pollEvents().stream()
    .filter(event -> event.kind() == StandardWatchEventKinds.ENTRY_CREATE)
    .map(event -> {
        Path taskDir = pathFromWatchable(key.watchable());
        Path createdPath = taskDir.resolve((Path) event.context());
        Set<PendingCacheResult> listeners = taskFutures.get(taskDir);
        if (createdPath.equals(successMarker(taskDir))) {
            try {
                knownOutputs.put(taskDir, makeOutput(taskDir));
                listeners.forEach(PendingCacheResult::success);
            } catch (UncheckedIOException ioException) {
                ioException.printStackTrace();
                listeners.forEach(l -> l.error(ioException));
            }
        } else if (createdPath.equals(failureMarker(taskDir))) {
            listeners.forEach(PendingCacheResult::failure);
        }
        return event;
    })
    .filter(event -> event.kind() == StandardWatchEventKinds.ENTRY_DELETE)
    .forEach(event -> {
        Path taskDir = (Path) event.context();
        Set<PendingCacheResult> listeners = taskFutures.get(taskDir);
        if (taskDir.toFile().mkdir()) {
            try {
                Files.createDirectory(outputDir(taskDir));
                Files.createFile(logFile(taskDir));
                listeners.iterator().next().ready();
            } catch (IOException e) {
                listeners.forEach(l -> l.error(new IllegalStateException("Existing task was canceled, not yet supported")));
            }
        }
        listeners.forEach(l -> l.error(new IllegalStateException("Existing task was canceled, not yet supported")));
    });