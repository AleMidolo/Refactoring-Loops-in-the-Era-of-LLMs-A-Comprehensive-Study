IntStream.range(0, chars.length - size + 1)
         .mapToObj(i -> new String(chars, i, size))
         .forEach(set::add);