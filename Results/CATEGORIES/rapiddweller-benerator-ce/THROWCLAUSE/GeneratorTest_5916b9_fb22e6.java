for (Entity entity : entities) {
    Object partValue = entity.get(partName);
    if (partValue != null) {
        if (partValue instanceof String) {
            counter.count(((String) partValue).length());
        } else {
            throw BeneratorExceptionFactory.getInstance().illegalArgument("Expected String, found " + partValue.getClass());
        }
    }
}