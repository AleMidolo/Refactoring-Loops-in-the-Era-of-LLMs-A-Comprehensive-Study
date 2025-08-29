s.chars()
        .mapToObj(c -> (char) c)
        .forEach(c -> {
            if (needsEscaping(c)) {
                builder.append(escapeChar);
            }
            builder.append(c);
        });