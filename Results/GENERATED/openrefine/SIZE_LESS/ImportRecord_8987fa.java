IntStream.range(size() - delta + 1, size() + 1)
          .forEach(i -> set(i, get(i - delta)));