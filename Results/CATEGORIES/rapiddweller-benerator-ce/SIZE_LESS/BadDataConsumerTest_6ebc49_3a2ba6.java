for (int i = 1; i <= 5; i++) {
    consumer.startConsuming(new ProductWrapper<Integer>().wrap(i));
    consumer.finishConsuming(new ProductWrapper<Integer>().wrap(i));
}