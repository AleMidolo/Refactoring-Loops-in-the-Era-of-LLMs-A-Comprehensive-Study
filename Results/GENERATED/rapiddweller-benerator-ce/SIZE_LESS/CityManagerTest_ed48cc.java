Country.GERMANY.getCities().stream()
    .map(City::getAreaCode)
    .forEach(areaCode -> assertTrue("Illegal area code: " + areaCode, pattern.matcher(areaCode).matches());