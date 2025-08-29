_changes.stream()
    .forEach(change -> History.writeOneChange(writer, change, options));