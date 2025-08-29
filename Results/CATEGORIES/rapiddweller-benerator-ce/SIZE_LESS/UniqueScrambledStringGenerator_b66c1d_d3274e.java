for (int i = minLength; i <= maxLength; i++) {
    subGens.add(new UniqueFixedLengthStringGenerator(chars, i, false));
}