attributes.keySet().stream()
    .filter(key -> !"id".equals(key))
    .findFirst()
    .ifPresent(key -> throw BeneratorExceptionFactory.getInstance().configurationError("Not a supported attribute of <store>: " + key));