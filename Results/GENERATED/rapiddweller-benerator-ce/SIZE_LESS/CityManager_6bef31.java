state.getCities().stream()
                .flatMap(city -> city.getPostalCodes().stream())
                .forEach(zipCode -> {
                    ((CityHelper) city).setPostalCode(zipCode);
                    writer.writeElement(city);
                });