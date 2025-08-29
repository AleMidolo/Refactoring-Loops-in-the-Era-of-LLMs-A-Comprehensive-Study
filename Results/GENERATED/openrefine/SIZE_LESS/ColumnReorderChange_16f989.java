IntStream.range(0, count)
    .mapToObj(i -> {
        try {
            return reader.readLine();
        } catch (IOException e) {
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(columnNames::add);