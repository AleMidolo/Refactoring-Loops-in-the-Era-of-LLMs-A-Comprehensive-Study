for (Map.Entry<E, SeedManager<E>> entry : successors.entrySet()) {
    helper.addSample(entry.getKey(), entry.getValue().getWeight());
}