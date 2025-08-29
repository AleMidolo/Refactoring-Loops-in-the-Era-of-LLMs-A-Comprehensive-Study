country.getStates().stream()
    .flatMap(state -> state.getCities().stream())
    .forEach(city -> city.getPostalCodes().forEach(zipCode -> {
        ((CityHelper) city).setPostalCode(zipCode);
        writer.writeElement(city);
    }));