groups.stream()
      .filter(group -> group.getProperty().getId().equals(pid))
      .flatMap(group -> group.getSnaks().stream())
      .filter(snak -> snak instanceof ValueSnak)
      .map(snak -> ((ValueSnak) snak).getValue())
      .forEach(results::add);