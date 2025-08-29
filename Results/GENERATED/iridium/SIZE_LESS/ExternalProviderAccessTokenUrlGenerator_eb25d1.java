params.entrySet().stream()
    .forEach(entry -> requestParams.put(entry.getKey(), List.of(entry.getValue()));