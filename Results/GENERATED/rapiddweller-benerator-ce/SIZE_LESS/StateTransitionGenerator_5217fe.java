transitions.stream()
    .forEach(t -> addTransition(convert(t.getFrom()), convert(t.getTo()), t.getWeight()));