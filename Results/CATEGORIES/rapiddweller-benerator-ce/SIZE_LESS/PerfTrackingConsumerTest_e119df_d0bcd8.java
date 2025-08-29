for (int i = 0; i < 10; i++) {
    tracker.startConsuming(new ProductWrapper<>().wrap(null));
    tracker.finishConsuming(new ProductWrapper<>().wrap(null));
}