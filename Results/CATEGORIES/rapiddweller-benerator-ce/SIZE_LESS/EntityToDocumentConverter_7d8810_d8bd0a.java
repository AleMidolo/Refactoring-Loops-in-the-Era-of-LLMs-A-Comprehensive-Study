for (Object element : set) {
    if (element instanceof Entity)
        element = convert((Entity) element);
    result.add(element);
}