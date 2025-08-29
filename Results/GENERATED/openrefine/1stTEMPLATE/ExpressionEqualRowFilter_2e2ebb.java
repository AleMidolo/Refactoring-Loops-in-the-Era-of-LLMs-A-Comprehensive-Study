return _matches.stream()
        .anyMatch(match -> testValue(v, match));