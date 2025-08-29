for (Object element : list) {
    if (element instanceof Entity)
        element = convert((Entity) element);
    result.add(element);
}