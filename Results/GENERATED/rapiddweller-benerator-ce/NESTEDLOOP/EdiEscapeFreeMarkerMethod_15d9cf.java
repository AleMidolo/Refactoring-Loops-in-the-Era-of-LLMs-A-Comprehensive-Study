IntStream.range(0, args.size())
    .forEach(index -> {
        if (index > 0) {
            builder.append(':');
        }
        String s = String.valueOf(args.get(index));
        s.chars().forEach(c -> {
            if (needsEscaping((char) c)) {
                builder.append(escapeChar);
            }
            builder.append((char) c);
        });
    });