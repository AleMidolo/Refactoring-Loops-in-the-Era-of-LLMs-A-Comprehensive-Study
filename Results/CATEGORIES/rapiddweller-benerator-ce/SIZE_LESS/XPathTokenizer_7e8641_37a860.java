for (int i = from; i <= to; i++) {
    if (i > from) {
        builder.append('/');
    }
    builder.append(tokens.get(i));
}