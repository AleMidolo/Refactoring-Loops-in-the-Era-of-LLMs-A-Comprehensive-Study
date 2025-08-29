for (int i = 0; i < typeMappings.length; i += 2) {
    String abstractType = (String) typeMappings[i];
    Object concreteType = typeMappings[i + 1];
    map(abstractType, (Class<?>) concreteType);
}