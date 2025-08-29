for (BeanSpec beanSpec : beanSpecs) {
    var bean = beanSpec.getBean();
    if (bean instanceof StorageSystemInserter) {
        if (((StorageSystemInserter) bean).getTargetType().getName().equals(sourceTableName)) {
            throw new RuntimeException("Source and destination table must be different from each other. Table/Collection name: " + sourceTableName);
        }
    }
    addConsumer(beanSpec, beneratorContext, consumerChain);
}