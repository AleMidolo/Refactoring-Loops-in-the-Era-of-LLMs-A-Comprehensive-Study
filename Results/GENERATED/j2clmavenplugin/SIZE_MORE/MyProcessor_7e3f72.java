```java
type.getEnclosedElements().stream()
    .filter(enclosedElement -> enclosedElement instanceof ExecutableElement)
    .map(enclosedElement -> (ExecutableElement) enclosedElement)
    .filter(method -> enclosedElement.getAnnotationMirrors().stream().anyMatch(annMirror -> annMirror.getAnnotationType().asElement().equals(annotationElt)))
    .map(method -> {
        AnnotationValue value = AnnotationMirrors.getAnnotationValue(enclosedElement.getAnnotationMirrors().stream().filter(annMirror -> annMirror.getAnnotationType().asElement().equals(annotationElt)).findAny().get(), "value");
        String path = AnnotationValues.getString(value);
        CharSequence contents = getStringContentsOfPath(filer, path);
        return MethodSpec.methodBuilder(method.getSimpleName().toString())
            .addModifiers(Modifier.PUBLIC)
            .addAnnotation(Override.class)
            .returns(String.class)
            .addCode("return $S;", contents)
            .build();
    })
    .forEach(methodSpec -> builder.addMethod(methodSpec));
```  
