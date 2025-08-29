states.values().stream()
        .map(State::getCities)
        .forEach(cities::addAll);