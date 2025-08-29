qualifierExprs.stream()
    .map(Optional::ofNullable)
    .forEach(qualifier -> {
        qualifier.ifPresent(q -> {
            validation.enter(new PathElement(Type.QUALIFIER, index));
            q.validate(validation);
            validation.leave();
        });
        if (qualifier.isEmpty()) {
            validation.addError("Empty qualifier in statement");
        }
        index++;
    });