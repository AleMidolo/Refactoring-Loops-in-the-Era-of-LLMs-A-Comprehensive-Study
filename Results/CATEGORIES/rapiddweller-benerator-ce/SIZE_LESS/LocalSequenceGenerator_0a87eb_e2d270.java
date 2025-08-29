for (Map.Entry<String, String> entry : values.entrySet()) {
    MAP.put(entry.getKey(), new IncrementalIdGenerator(Long.parseLong(entry.getValue())));
}