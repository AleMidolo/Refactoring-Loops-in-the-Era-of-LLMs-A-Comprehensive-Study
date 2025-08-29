for (int i = 0; i < iterations; i++) {
    counter.count(generator.generate(wrapper).unwrap());
}