for (Sequence sequence : SequenceManager.registeredSequences()) {
    if (!(sequence instanceof HeadSequence)) {
        checkNumberGenerator(type, min, max, granularity, sequence);
    }
}