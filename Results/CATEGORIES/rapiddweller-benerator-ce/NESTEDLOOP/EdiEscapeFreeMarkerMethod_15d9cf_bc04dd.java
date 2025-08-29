for (int index = 0; index < args.size(); index++) {
    if (index > 0) {
        builder.append(':');
    }
    String s = String.valueOf(args.get(index));
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (needsEscaping(c)) {
            builder.append(escapeChar);
        }
        builder.append(c);
    }
}