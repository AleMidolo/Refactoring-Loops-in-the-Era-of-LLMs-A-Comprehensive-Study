city.getPostalCodes().stream()
    .forEach(zipCode -> {
        ((CityHelper) city).setPostalCode(zipCode);
        writer.writeElement(city);
});