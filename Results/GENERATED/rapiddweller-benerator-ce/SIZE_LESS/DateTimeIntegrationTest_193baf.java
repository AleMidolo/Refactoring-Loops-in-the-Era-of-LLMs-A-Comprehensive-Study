products.stream()
        .map(product -> (Date) product[0])
        .peek(date -> assertFalse(date.before(MIN_DATE)))
        .forEach(usedDates::add);