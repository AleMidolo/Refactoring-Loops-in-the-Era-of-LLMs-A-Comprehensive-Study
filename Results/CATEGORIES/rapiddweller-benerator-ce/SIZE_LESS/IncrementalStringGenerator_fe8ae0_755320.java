for (int i = minLength; i <= maxLength; i += lengthGranularity) {
    builder.add(new UniqueFixedLengthStringGenerator(chars, i, true));
}