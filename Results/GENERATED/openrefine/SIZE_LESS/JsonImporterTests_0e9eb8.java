IntStream.range(1, 7)
         .mapToObj(this::getElementWithDuplicateSubElement)
         .collect(Collectors.joining(","));