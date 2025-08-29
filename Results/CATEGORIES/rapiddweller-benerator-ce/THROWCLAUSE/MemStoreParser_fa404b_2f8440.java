for (String key : attributes.keySet()) {
    if (!"id".equals(key)) {
        throw BeneratorExceptionFactory.getInstance().configurationError("Not a supported attribute of <store>: " + key);
    }
}