IntStream.range(0, count)
    .mapToObj(i -> {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    })
    .map(line -> line == null || line.length() == 0 ? null : ReconType.load(line))
    .forEach(columnTypes::add);