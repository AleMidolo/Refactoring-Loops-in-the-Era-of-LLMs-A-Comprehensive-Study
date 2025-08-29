for (int i = 0; i < values.length; i++) {
    gens[i] = new NShotGeneratorProxy<>(new ConstantGenerator<>(values[i]), 1);
}