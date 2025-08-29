descriptors.stream()
    .peek(descriptor -> {
        String note = "Exporting table " + descriptor.getName();
        if (monitor != null) {
            monitor.setNote(note);
            if (monitor.isCanceled()) {
                throw BeneratorExceptionFactory.getInstance().operationCancelled("Export cancelled");
            }
        }
        logger.info(note);
        Thread.yield();
    })
    .forEach(descriptor -> {
        DataIterator<Entity> source = db.queryEntities(descriptor.getName(), null, null).iterator();
        DataContainer<Entity> container = new DataContainer<>();
        ProductWrapper<Entity> wrapper = new ProductWrapper<>();
        while ((container = source.next(container)) != null) {
            Entity entity = container.getData();
            wrapper.wrap(entity);
            exporter.startConsuming(wrapper);
            wrapper.wrap(entity);
            exporter.finishConsuming(wrapper);
            count++;
        }
        if (monitor != null) {
            monitor.advance();
        }
    });