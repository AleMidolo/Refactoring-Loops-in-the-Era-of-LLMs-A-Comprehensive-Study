for (Annotation annotation : testMethod.getAnnotations()) {
    mapParamAnnotation(annotation, instance, testMethod.getDeclaringClass());
}