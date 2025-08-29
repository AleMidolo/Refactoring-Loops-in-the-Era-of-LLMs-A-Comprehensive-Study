for (int i = 0; i < size; i++) {
    ProductWrapper<S> component = generateFromSource();
    if (component == null) {
        return null;
    }
    Array.set(array, i, component.unwrap());
}