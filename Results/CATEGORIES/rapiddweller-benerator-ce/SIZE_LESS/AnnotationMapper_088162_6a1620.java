for (int i = 0; i < values.length; i++) {
    if (i > 0) {
        builder.append(',');
    }
    builder.append("'").append(values[i].replace("'", "\\'")).append("'");
}