for (Annotation paramAnnotation : paramsAnnotations[i]) {
    if (paramAnnotation.annotationType() == Last.class) {
        return i;
    }
}