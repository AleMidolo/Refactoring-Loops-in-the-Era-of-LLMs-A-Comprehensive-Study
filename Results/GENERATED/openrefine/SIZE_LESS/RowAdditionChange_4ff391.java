IntStream.range(0, count)
    .mapToObj(i -> {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    })
    .filter(Objects::nonNull)
    .map(line -> Row.load(line, pool))
    .forEach(rows::add);