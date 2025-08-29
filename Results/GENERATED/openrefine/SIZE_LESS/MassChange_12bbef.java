_changes.stream()
        .forEach(c -> History.writeOneChange(writer, c, options));