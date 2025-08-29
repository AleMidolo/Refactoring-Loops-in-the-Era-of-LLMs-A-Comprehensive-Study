type.getEnclosedElements().stream()
    .filter(enclosedElement -> enclosedElement instanceof ExecutableElement)
    .map(enclosedElement -> (ExecutableElement) enclosedElement)
    .filter(method -> enclosedElement.getAnnotationMirrors().stream().anyMatch(annMirror -> annMirror.getAnnotationType().asElement().equals(annotationElt)))
    .forEach(method -> {
        AnnotationValue value = AnnotationMirors.getAnnotationValue(enclosedElement.getAnnotationMirrors().stream().filter(annMirror -> annMirror.getAnnotationType().asElement().equals(annotationElt)).findFirst().get(), "value");
        String path = AnnotationValues.getString(value);
        CharSequence contents = getStringContentsOfPath(filer, path);
        MethodSpec methodSpec = MethodSpec.methodBuilder(method.getSimpleName().toString())
                                            .addModifiers(Modifier.PUBLIC)
                                            .addAnnotation(Override.class)
                                            .returns(String.class)
                                            .addCode("return $S;", contents)
                                            .build();
        builder.addMethod(methodSpec);
    });