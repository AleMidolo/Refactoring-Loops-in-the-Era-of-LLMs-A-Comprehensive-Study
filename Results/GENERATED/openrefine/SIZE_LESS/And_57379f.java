boolean result = Arrays.stream(args)
                      .noneMatch(o -> !Not.objectToBoolean(o));