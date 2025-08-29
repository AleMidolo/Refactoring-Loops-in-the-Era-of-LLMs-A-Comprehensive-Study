country.getStates().stream()
    .flatMap(state -> state.getCities().stream())
    .forEach(city -> generator.addValue(city));