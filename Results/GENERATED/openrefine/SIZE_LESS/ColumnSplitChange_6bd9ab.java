IntStream.range(0, count)
         .mapToObj(i -> {
             try {
                 String line = reader.readLine();
                 return line != null ? Integer.parseInt(line) : null;
             } catch (IOException e) {
                 throw new UncheckedIOException(e);
             }
         })
         .filter(Objects::nonNull)
         .forEach(rowIndices::add);