IntStream.range(0, length)
         .mapToObj(i -> generateFromSource().unwrap())
         .forEach(builder::append);