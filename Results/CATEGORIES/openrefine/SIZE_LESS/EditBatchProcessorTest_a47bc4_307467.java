for (int i = 124; i < 190; i++) {
    assertEquals(processor.remainingEdits(), 190 - i);
    processor.performEdit();
}