IntStream.range(0, cities.getLength())
    .mapToObj(i -> cities.item(i).getTextContent())
    .forEach(city -> assertTrue("not an anonymized city: " + city, anonCities.contains(city)));