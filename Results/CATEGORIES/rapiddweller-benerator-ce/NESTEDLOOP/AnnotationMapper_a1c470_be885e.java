for (int i = 0; i < paramsAnnotations.length; i++) {
    for (Annotation paramAnnotation : paramsAnnotations[i]) {
        if (paramAnnotation.annotationType() == Last.class) {
            return i;
        }
    }
}