typeEntry.getValue().stream()
    .forEach(entity -> printer.printStd(index.getAndIncrement() + ": " + entity));