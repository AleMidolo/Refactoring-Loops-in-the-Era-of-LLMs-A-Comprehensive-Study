for (Entry<String, Object> entry : components) {
    if (first) {
        first = false;
    } else {
        builder.append(", ");
    }
    builder.append(entry.getKey());
}