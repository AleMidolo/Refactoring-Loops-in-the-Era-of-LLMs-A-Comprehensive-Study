for (Annotation annotation : annotations) {
    Package annoPkg = annotation.annotationType().getPackage();
    if ((annoPkg == BENERATOR_ANNO_PACKAGE || annoPkg == BEANVAL_ANNO_PACKAGE) && explicitlyMappedAnnotation(annotation)) {
        return true;
    }
}