for (Map.Entry<String, ?> entry : root.entrySet()) {
    context.set(entry.getKey(), entry.getValue());
}