entities.stream()
        .map(entity -> entity.get(partName))
        .forEach(counter::count);