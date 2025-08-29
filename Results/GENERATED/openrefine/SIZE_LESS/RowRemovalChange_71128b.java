IntStream.range(0, count)
         .mapToObj(i -> reader.readLine())
         .filter(Objects::nonNull)
         .map(line -> Row.load(line, pool))
         .forEach(rows::add);