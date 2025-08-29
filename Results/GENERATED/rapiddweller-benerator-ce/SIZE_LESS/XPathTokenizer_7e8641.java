IntStream.rangeClosed(from, to)
        .forEach(i -> {
            if (i > from) {
                builder.append('/');
            }
            builder.append(tokens.get(i));
        });