values.entrySet().stream()
        .forEach(entry -> MAP.put(entry.getKey(), new IncrementalIdGenerator(Long.parseLong(entry.getValue())));