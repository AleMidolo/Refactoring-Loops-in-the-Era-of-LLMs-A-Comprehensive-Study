IntStream.range(0, numbers.length)
         .forEach(i -> ts[i] = converter.convert(numbers[i]));