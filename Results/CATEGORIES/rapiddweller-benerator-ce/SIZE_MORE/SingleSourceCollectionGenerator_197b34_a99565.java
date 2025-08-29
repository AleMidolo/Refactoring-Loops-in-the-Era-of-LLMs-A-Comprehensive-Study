for (int i = 0; size == null || i < size; i++) {
    ProductWrapper<I> component = generateFromSource();
    if (component == null) {
        getSource().reset();
        break;
    }
    collection.add(component.unwrap());
}