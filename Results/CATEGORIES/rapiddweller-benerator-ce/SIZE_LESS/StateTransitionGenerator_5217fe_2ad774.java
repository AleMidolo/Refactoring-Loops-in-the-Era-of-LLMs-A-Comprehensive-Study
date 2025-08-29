for (WeightedTransition t : transitions) {
    addTransition(convert(t.getFrom()), convert(t.getTo()), t.getWeight());
}