sources.stream()
       .filter(Objects::nonNull)
       .forEach(source -> source.init(context));