IntStream.rangeClosed(1, 5)
    .forEach(i -> {
        consumer.startConsuming(new ProductWrapper<Integer>().wrap(i));
        consumer.finishConsuming(new ProductWrapper<Integer>().wrap(i));
    });