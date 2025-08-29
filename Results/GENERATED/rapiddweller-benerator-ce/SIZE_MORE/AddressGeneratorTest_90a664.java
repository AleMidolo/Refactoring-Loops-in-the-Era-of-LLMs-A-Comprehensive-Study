IntStream.range(0, 100)
    .forEach(i -> {
        Address address = generator.generate();
        logger.debug("{}", address);
        assertNotNull(address);
        String cityAreaCode = address.getCity().getAreaCode();
        if (country.isMobilePhoneCityRelated()) {
            assertEquals(cityAreaCode, address.getMobilePhone().getAreaCode());
        }
        assertEquals(cityAreaCode, address.getOfficePhone().getAreaCode());
        assertEquals(cityAreaCode, address.getFax().getAreaCode());
        assertNotNull(address.getState());
        assertNotNull(address.getCountry());
        assertNotNull("No organization specified", address.getOrganization());
        assertNotNull("No department specified", address.getDepartment());
        if (supported) {
            assertEquals(country, address.getCountry());
        } else {
            assertEquals(Country.US, address.getCountry());
        }
    });