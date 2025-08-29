for (Entry<String, Object> entry : properties.entrySet()) {
    merged.setProperty(entry.getKey(), entry.getValue());
}