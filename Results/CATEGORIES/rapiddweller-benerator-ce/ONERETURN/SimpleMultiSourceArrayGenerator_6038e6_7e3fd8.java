for (int i = 0; i < array.length; i++) {
    try {
        ProductWrapper<S> productWrapper = sources.get(i).generate((ProductWrapper) getSourceWrapper());
        if (productWrapper == null) {
            available = false;
            return null;
        }
        array[i] = productWrapper.unwrap();
    } catch (Exception e) {
        throw BeneratorExceptionFactory.getInstance().operationFailed("Generation failed for generator #" + i + " of " + this, e);
    }
}