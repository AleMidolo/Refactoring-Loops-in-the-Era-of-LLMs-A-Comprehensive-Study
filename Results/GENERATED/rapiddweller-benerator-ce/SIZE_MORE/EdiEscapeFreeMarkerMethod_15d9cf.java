args.stream()
    .map(Object::toString)
    .forEach(s -> {
        if (builder.length() > 0) {
            builder.append(":");
        }
        s.chars().forEach(c -> {
            if (needsEscaping((char) c)) {
                builder.append(escapeChar);
            }
            builder.append((char) c);
        });
    });