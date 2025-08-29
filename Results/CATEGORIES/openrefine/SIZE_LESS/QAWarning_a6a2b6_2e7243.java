for (Entry<String, Object> entry : other.getProperties().entrySet()) {
    merged.setProperty(entry.getKey(), entry.getValue());
}