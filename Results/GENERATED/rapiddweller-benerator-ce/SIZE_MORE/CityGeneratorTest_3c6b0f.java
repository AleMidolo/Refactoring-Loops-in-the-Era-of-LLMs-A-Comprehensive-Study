IntStream.range(0, 20)
    .mapToObj(i -> g.generate())
    .forEach(city -> {
        ConsolePrinter.printStandard(city.toString(), "  " + city.getState().toString(), "  " + city.getCountry().toString());
        assertNotNull(city);
        assertNotNull(city.getName());
        State state = city.getState();
        assertNotNull(state);
        assertNotNull(state.getId());
        assertNotNull(state.getName());
        assertEquals(country, city.getCountry());
        assertEquals(country, state.getCountry());
    });