return Arrays.stream(mappings)
        .filter(mapping -> mapping[0].length() == 0 || name.endsWith(mapping[0]))
        .findFirst()
        .map(mapping -> name.substring(0, name.length() - mapping[0].length()) + mapping[1])
        .orElse(null);