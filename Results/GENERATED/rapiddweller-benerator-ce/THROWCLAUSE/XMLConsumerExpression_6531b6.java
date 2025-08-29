beanSpecs.stream()
        .filter(beanSpec -> beanSpec.getBean() instanceof StorageSystemInserter)
        .filter(beanSpec -> ((StorageSystemInserter) beanSpec.getBean()).getTargetType().getName().equals(sourceTableName))
        .findFirst()
        .ifPresent(beanSpec -> {
            throw new RuntimeException("Source and destination table must be different from each other. Table/Collection name: " + sourceTableName);
        });

beanSpecs.forEach(beanSpec -> addConsumer(beanSpec, beneratorContext, consumerChain));