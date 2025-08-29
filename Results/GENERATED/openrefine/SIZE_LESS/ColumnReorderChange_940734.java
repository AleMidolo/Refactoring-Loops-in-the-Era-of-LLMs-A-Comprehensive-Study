IntStream.range(0, count)
         .mapToObj(i -> reader.readLine())
         .filter(Objects::nonNull)
         .map(Column::load)
         .forEach(oldColumns::add);