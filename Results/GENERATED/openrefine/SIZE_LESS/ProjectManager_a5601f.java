_entry.getKey()))
    .findFirst()
    .ifPresent(key -> {
        id = key;
        count += 1;
    });