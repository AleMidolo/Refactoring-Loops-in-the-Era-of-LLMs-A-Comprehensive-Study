sources.stream()
       .filter(source -> !source.isThreadSafe())
       .findAny()
       .isPresent();