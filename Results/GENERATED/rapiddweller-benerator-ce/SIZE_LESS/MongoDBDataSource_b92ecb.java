return Arrays.stream(MONGODB_COMMANDS)
        .filter(command -> mongoQuery.containsKey(command))
        .map(command -> mongoQuery.get(command).toString())
        .findFirst()
        .orElse(null);