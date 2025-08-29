return Arrays.stream(annotations)
    .map(Annotation::annotationType)
    .map(Class::getPackage)
    .anyMatch(annoPkg -> (annoPkg == BENERATOR_ANNO_PACKAGE || annoPkg == BEANVAL_ANNO_PACKAGE) && explicitlyMappedAnnotation(annotation));