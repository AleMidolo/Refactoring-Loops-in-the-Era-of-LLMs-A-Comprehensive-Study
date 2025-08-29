for (City city : Country.GERMANY.getCities()) {
    String areaCode = city.getAreaCode();
    assertTrue("Illegal area code: " + areaCode, pattern.matcher(areaCode).matches());
}