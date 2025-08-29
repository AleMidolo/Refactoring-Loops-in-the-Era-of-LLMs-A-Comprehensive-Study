for (Object element : array) {
    if (element instanceof Entity) {
        process((Entity) element, exporter);
    }
}