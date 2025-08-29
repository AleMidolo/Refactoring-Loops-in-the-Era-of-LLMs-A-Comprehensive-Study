collection.stream()
    .map(String::length)
    .forEach(counter::count);