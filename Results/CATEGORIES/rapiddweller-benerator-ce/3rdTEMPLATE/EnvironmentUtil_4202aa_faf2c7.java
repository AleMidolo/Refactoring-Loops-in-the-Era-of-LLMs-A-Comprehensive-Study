for (Map.Entry<String, String> entry : srcProps.entrySet()) {
    String name = entry.getKey();
    if (name.startsWith("db_")) {
        resultProps.put(name.substring(3), entry.getValue());
    }
}