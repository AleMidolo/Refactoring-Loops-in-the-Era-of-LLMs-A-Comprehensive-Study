for (Consumer processor : components) {
    processor.startConsuming(((ProductWrapper) wrapper).wrap(product));
}