for (AttachedWeightSampleGenerator<E> tmp : transitionsGenerators.values()) {
    if (tmp.containsSample(null)) {
        hasEndTransition = true;
        break;
    }
}