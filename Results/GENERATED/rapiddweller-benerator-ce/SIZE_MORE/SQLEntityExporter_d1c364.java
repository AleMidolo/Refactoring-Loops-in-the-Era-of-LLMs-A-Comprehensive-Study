components.stream()
            .forEach(entry -> {
                if (first.get()) {
                    first.set(false);
                } else {
                    builder.append(", ");
                }
                builder.append(entry.getKey());
            });