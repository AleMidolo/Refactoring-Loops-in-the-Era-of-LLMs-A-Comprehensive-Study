for (Consumer processor : components) {
    processor.finishConsuming(((ProductWrapper) wrapper).wrap(product));
}