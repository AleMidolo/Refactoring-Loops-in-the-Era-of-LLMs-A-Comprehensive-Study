```java
beanSpecs.stream()
    .map(BeanSpec::getBean)
    .filter(bean -> bean instanceof StorageSystemInserter)
    .map(bean -> (StorageSystemInserter) bean)
    .filter(inserter -> inserter.getTargetType().getName().equals(sourceTableName))
    .findFirst()
    .ifPresent(inserter -> {
        throw new RuntimeException("Source and destination table must be different from each other. Table/Collection name: " + sourceTableName);
    });

beanSpecs.forEach(beanSpec -> addConsumer(beanSpec, beneratorContext, consumerChain));
```