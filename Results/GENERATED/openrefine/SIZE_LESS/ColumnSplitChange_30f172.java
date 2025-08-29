IntStream.range(0, count)
    .mapToObj(i -> {
        try {
            String line = reader.readLine();
            return (line != null) ? Row.load(line, pool) : null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(newRows::add);