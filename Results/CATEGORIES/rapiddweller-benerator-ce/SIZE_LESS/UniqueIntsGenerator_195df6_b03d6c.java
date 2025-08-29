for (int i = 0; i < length; i++) {
    this.displayColumn[i] = colGen.generate().intValue();
    this.digitOffsets[i] = (length - 1 - this.displayColumn[i]) % radix;
}