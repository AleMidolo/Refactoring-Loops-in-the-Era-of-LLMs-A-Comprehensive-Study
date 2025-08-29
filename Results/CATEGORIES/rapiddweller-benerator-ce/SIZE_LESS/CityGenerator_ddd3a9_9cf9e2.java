for (State state : country.getStates()) {
    for (City city : state.getCities()) {
        generator.addValue(city);
    }
}