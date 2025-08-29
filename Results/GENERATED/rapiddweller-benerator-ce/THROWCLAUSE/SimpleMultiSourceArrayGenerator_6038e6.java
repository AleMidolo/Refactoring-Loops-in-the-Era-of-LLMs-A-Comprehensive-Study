
```java
IntStream.range(0, array.length)
        .mapToObj(i -> {
            try {
                ProductWrapper<S> productWrapper = sources.get(i).generate((ProductWrapper) getSourceWrapper());
                if (productWrapper == null) {
                    available = false;
                    return null;
                }
                return productWrapper.unwrap();
            } catch (Exception e) {
                throw BeneratorExceptionFactory.getInstance().operationFailed("Generation failed for generator #" + i + " of " + this, e);
            }
        })
        .toArray();
```