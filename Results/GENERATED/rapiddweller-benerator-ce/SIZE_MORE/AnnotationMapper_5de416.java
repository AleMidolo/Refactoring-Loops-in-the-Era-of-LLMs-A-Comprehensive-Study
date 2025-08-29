annotations.stream()
        .filter(annotation -> annotation instanceof Database)
        .forEach(annotation -> parseDatabase((Database) annotation, context));

annotations.stream()
        .filter(annotation -> annotation instanceof Bean)
        .forEach(annotation -> parseBean((Bean) annotation, context));