ts.stream()
    .forEach(t -> addTransition((E) t.getFrom(), (E) t.getTo(), t.getWeight()));