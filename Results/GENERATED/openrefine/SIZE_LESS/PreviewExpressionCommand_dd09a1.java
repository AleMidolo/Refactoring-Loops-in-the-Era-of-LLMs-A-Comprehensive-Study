IntStream.range(0, a.length)
         .skip(1)
         .forEach(i -> {
             if (i > 0) {
                 sb.append(", ");
             }
             writeValue(sb, a[i], true);
         });