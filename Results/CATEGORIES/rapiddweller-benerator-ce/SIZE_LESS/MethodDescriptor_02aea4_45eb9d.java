for (Annotation a : annotations) {
    if (annotationType.isAssignableFrom(a.getClass())) {
        return (T) a;
    }
}