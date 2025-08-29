products.stream()
        .map(product -> (Date) product[0])
        .peek(date -> assertFalse(date.after(MAX_DATE)))
        .forEach(usedDates::add);