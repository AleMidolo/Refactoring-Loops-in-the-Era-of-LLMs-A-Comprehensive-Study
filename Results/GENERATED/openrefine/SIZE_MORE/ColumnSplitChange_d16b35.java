IntStream.range(0, count)
         .mapToObj(i -> reader.readLine())
         .filter(Objects::nonNull)
         .map(Integer::parseInt)
         .map(valueCount -> {
             List<Serializable> tuple = new ArrayList<>(valueCount);
             return IntStream.range(0, valueCount)
                             .mapToObj(r -> reader.readLine())
                             .map(line -> (Serializable) ParsingUtilities.mapper.readValue(line, Object.class))
                             .peek(tuple::add)
                             .collect(Collectors.toList());
         })
         .forEach(tuples::add);