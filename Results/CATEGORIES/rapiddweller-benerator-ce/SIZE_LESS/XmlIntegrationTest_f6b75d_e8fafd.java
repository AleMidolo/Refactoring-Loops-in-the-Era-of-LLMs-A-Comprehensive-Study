for (int i = 0; i < cities.getLength(); i++) {
    String city = cities.item(i).getTextContent();
    assertTrue("not an anonymized city: " + city, anonCities.contains(city));
}