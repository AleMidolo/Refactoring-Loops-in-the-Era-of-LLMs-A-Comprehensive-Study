for (int i = 0; i < instances.length; i++) {
    if (i > 0) {
        builder.append(",");
    }
    builder.append("'").append(instances[i]).append("'");
}