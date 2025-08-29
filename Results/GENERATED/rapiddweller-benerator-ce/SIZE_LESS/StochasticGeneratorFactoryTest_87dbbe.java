SequenceManager.registeredSequences().stream()
    .filter(sequence -> !(sequence instanceof HeadSequence))
    .forEach(sequence -> checkNumberGenerator(type, min, max, granularity, sequence));