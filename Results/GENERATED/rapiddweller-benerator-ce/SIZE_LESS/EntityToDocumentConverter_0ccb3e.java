IntStream.range(0, length)
         .mapToObj(i -> Array.get(array, i))
         .map(element -> element instanceof Entity ? convert((Entity) element) : element)
         .forEach(result::add);