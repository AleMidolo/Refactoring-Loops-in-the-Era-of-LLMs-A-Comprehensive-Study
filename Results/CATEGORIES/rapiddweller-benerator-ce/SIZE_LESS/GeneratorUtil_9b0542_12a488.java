for (int i = 1; i < sources.length; i++) {
    Class<T> tmp = sources[i].getGeneratedType();
    if (tmp.isAssignableFrom(type)) {
        type = tmp;
    }
}