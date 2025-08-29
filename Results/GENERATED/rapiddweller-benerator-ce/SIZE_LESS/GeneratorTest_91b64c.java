IntStream.range(0, iterations)
         .forEach(i -> counter.count(generator.generate(wrapper).unwrap()));