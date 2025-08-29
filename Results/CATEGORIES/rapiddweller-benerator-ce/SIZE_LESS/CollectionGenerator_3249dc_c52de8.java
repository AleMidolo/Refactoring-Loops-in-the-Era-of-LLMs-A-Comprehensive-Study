for (int i = 0; i < size; i++) {
    ProductWrapper<I> item = generateFromSource();
    if (item == null) {
        return null;
    }
    collection.add(item.unwrap());
}