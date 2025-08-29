for (int i = 0; i < 1000; i++) {
    T n = generator.generate(wrapper).unwrap();
    double d = n.doubleValue();
    assertTrue(d >= min.doubleValue());
    assertTrue(d <= max.doubleValue());
    int index = (int) ((d - min.doubleValue()) / granularity.doubleValue());
    count[index]++;
}