Arrays.stream(array)
      .filter(element -> element instanceof Entity)
      .map(element -> (Entity) element)
      .forEach(entity -> process(entity, exporter));