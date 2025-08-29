IntStream.range(0, 4)
        .forEach(col -> {
            int width = list.stream()
                    .map(strings -> strings[col].length())
                    .max(Integer::compare)
                    .orElse(0);
            widths[col] = width;
        });