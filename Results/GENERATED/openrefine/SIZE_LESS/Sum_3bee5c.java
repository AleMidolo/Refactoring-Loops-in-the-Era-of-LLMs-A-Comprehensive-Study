IntStream.range(0, length)
         .forEach(i -> {
             Object n = a[length - i - 1];
             if (n instanceof Number) {
                 total += ((Number) n).doubleValue();
             }
         });