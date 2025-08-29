IntStream.range(0, args.size()).forEach(i -> {
    writeText("|");
    iterate(args.get(i));
});