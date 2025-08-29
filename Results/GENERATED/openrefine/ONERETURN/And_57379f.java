return Arrays.stream(args)
    .noneMatch(o -> !Not.objectToBoolean(o));