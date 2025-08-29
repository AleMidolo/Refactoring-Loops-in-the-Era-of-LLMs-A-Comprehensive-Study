IntStream.range(0, values.length)
         .forEach(i -> gens[i] = new NShotGeneratorProxy<>(new ConstantGenerator<>(values[i]), 1));