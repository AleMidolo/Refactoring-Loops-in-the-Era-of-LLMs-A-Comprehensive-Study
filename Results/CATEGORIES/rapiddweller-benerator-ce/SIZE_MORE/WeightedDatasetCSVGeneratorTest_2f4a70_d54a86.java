for (int i = 0; i < 100000 && (!mueller || !garcia); i++) {
    String name = generator.generate();
    if ("M�ller".equals(name)) {
        mueller = true;
    }
    if ("Garc�a".equals(name)) {
        garcia = true;
    }
}