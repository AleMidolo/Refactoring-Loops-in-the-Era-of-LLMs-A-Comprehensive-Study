for (String zipCode : city.getPostalCodes()) {
    ((CityHelper) city).setPostalCode(zipCode);
    writer.writeElement(city);
}