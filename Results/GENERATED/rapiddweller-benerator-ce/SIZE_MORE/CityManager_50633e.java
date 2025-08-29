country.getStates().forEach(state -> state.getCities().forEach(city -> city.getPostalCodes().forEach(zipCode -> {
    ((CityHelper) city).setPostalCode(zipCode);
    writer.writeElement(city);
})));