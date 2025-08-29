return annotations.stream()
    .anyMatch(annotation -> {
        Package annoPkg = annotation.annotationType().getPackage();
        return (annoPkg == BENERATOR_ANNO_PACKAGE || annoPkg == BEANVAL_ANNO_PACKAGE) && explicitlyMappedAnnotation(annotation);
    });