set.stream()
   .map(element -> element instanceof Entity ? convert((Entity) element) : element)
   .forEach(result::add);