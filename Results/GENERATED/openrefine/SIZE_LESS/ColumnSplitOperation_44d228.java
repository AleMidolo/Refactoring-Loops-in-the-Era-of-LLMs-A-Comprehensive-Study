lastIndex = 0;
IntStream.range(0, _fieldLengths.length)
         .mapToObj(i -> {
             int from = lastIndex;
             int to = Math.min(from + _fieldLengths[i], s.length());
             lastIndex = to;
             return s.substring(from, to);
         })
         .map(this::stringToValue)
         .forEach(results::add);