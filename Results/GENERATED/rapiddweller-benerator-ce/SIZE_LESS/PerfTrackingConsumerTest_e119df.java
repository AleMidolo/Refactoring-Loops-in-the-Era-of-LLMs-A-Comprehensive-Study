IntStream.range(0, 10)
        .forEach(i -> {
            tracker.startConsuming(new ProductWrapper<>().wrap(null));
            tracker.finishConsuming(new ProductWrapper<>().wrap(null));
        });