for (Element enclosedElement : type.getEnclosedElements()) {
    if (enclosedElement instanceof ExecutableElement) {
        ExecutableElement method = (ExecutableElement) enclosedElement;
        Optional<? extends AnnotationMirror> myAnnotation = enclosedElement.getAnnotationMirrors().stream().filter(annMirror -> annMirror.getAnnotationType().asElement().equals(annotationElt)).findAny();
        if (!myAnnotation.isPresent()) {
            continue;
        }
        AnnotationValue value = AnnotationMirrors.getAnnotationValue(myAnnotation.get(), "value");
        String path = AnnotationValues.getString(value);
        CharSequence contents = getStringContentsOfPath(filer, path);
        MethodSpec methodSpec = MethodSpec.methodBuilder(method.getSimpleName().toString()).addModifiers(Modifier.PUBLIC).addAnnotation(Override.class).returns(String.class).addCode("return $S;", contents).build();
        builder.addMethod(methodSpec);
    }
}