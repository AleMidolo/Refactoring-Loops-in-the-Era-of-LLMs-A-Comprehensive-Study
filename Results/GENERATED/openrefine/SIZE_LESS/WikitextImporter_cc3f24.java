args.stream()
    .forEach(arg -> {
        writeText("|");
        iterate(arg);
    });