reader.lines().limit(count)
        .filter(Objects::nonNull)
        .map(line -> line.isEmpty() ? null : Integer.valueOf(line))
        .forEach(rowCount -> IntStream.range(0, rowCount)
                .forEach(r -> IntStream.range(0, columnNames.size())
                        .forEach(c -> new Object())));