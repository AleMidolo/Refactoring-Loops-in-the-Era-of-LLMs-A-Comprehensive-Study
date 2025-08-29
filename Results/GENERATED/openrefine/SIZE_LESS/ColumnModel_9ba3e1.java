IntStream.range(0, count)
         .mapToObj(i -> Column.load(reader.readLine()))
         .forEach(columns::add);