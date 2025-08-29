IntStream.range(124, 190)
    .forEach(i -> {
        assertEquals(processor.remainingEdits(), 190 - i);
        processor.performEdit();
    });