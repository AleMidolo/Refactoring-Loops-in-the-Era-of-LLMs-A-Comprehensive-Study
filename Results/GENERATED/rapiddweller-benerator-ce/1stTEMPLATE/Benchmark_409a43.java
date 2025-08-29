return Arrays.stream(INSTANCES)
        .filter(setup -> setup.name.equals(setupName))
        .findFirst()
        .orElse(null);