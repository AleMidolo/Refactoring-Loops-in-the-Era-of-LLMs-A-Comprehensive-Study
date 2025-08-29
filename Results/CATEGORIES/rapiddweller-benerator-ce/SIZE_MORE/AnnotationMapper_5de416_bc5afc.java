for (Annotation annotation : annotations) {
    if (annotation instanceof Database) {
        parseDatabase((Database) annotation, context);
    } else if (annotation instanceof Bean) {
        parseBean((Bean) annotation, context);
    }
}