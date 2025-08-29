for (Map.Entry<String, IncrementalIdGenerator> entry : MAP.entrySet()) {
    values.put(entry.getKey(), String.valueOf(entry.getValue().getCursor()));
}