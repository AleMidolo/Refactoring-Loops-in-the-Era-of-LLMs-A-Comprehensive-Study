for (int i = 0; i < 100000 && (!mueller || !garcia); i++) {
    String name = generator.generate();
    if ("Müller".equals(name)) {
        mueller = true;
    }
    if ("García".equals(name)) {
        garcia = true;
    }
}