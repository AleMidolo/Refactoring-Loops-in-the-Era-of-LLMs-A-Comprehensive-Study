for (int i = 0; i < 100; i++) {
    Character[] sequence = generator.generate();
    checkSequence(sequence, depth);
}