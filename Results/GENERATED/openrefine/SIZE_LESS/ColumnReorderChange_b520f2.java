IntStream.range(0, count)
         .mapToObj(i -> {
             try {
                 return reader.readLine();
             } catch (IOException e) {
                 throw new UncheckedIOException(e);
             }
         })
         .filter(Objects::nonNull)
         .map(Column::load)
         .forEach(newColumns::add);