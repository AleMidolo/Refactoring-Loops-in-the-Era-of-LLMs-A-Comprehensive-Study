return Arrays.stream(MONGODB_COMMANDS)
        .filter(command -> mongoQuery.containsKey(command))
        .findFirst()
        .map(command -> mongoQuery.get(command).toString())
        .orElse(null);