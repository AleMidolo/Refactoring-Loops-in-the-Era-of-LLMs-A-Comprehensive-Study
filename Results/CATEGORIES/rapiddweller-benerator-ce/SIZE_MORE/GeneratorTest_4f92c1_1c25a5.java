for (int i = 0; i < iterations; i++) {
    ProductWrapper<T> tmp = generator.generate(wrapper);
    if (tmp != null) {
        counter.count(tmp.unwrap());
    } else {
        fail(iterations + " iterations requested, but generator is depleted after " + i + " iterations");
    }
}