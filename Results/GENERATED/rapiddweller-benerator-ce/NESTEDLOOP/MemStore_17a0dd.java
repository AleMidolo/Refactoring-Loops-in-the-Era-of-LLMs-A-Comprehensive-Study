entitiesByType.entrySet().stream()
    .forEach(typeEntry -> {
        printer.printStd(typeEntry.getKey() + ':');
        AtomicInteger index = new AtomicInteger(0);
        typeEntry.getValue().stream()
            .forEach(entity -> printer.printStd(index.getAndIncrement() + ": " + entity));
    });