IntStream.range(0, length)
    .forEach(i -> array[i] = generateFromSource().unwrap());