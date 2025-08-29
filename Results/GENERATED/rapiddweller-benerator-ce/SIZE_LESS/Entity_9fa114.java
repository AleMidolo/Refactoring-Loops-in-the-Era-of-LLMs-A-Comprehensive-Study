IntStream.range(0, length)
         .forEach(i -> Array.set(result, i, copyOrSelf(Array.get(array, i)));