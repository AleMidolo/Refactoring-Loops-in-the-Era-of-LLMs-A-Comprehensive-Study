for (int i = 0; i < n; i++) {
    SimpleTypeDescriptor alternative = descriptor.getAlternatives().get(i);
    sources[i] = createGenerator(alternative, null, false, Uniqueness.NONE, context);
}