return Arrays.stream(args)
    .anyMatch(o -> !Not.objectToBoolean(o));