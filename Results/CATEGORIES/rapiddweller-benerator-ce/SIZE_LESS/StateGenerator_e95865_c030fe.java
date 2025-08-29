for (WeightedTransition t : ts) {
    addTransition((E) t.getFrom(), (E) t.getTo(), t.getWeight());
}