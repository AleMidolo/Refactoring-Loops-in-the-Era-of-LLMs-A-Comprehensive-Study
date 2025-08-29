for (int i = 0; i < length; i++) {
    Object element = Array.get(array, i);
    if (element instanceof Entity)
        element = convert((Entity) element);
    result.add(element);
}