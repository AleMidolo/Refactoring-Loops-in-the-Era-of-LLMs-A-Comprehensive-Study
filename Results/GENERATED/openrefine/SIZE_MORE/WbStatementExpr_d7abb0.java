qualifierExprs.stream()
    .forEach(qualifier -> {
        if (qualifier == null) {
            validation.addError("Empty qualifier in statement");
        } else {
            validation.enter(new PathElement(Type.QUALIFIER, index));
            qualifier.validate(validation);
            validation.leave();
        }
        index++;
    });