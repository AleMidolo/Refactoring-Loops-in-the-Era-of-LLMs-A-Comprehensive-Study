for (int i = 1; i < products.size() - 1; i++) {
    int oldState = 1 + ((i - 1) % 2);
    int newState = 1 + (i % 2);
    assertEquals(new Transition(oldState, newState), products.get(i));
}