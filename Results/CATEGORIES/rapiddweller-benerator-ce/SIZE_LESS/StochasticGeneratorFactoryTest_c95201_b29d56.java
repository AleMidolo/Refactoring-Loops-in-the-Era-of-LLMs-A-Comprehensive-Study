for (Sequence sequence : SequenceManager.registeredSequences()) {
    Generator<Date> generator = generatorFactory.createDateGenerator(date(2006, 0, 1), date(2010, 11, 31), Period.DAY.getMillis(), sequence);
    System.out.println(sequence);
    if (!(sequence instanceof HeadSequence) && !(sequence instanceof FibonacciSequence) && !(sequence instanceof PadovanSequence)) {
        initAndUseGenerator(generator);
    }
}