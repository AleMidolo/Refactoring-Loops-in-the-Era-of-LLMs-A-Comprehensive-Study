sources.stream()
    .forEach(source -> appendFile(out, source, buffer, context));