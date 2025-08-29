for (int i = 0; i < digits.length; i++) {
    buffer[displayColumn[i]] = (digits[i] + digitOffsets[i] + cycleCounter) % radix;
}