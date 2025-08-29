subStatements.stream()
    .forEach(subStatement -> {
        if (subStatement instanceof Element) {
            ((Element) subStatement).accept(visitor);
        } else {
            visitor.visit(subStatement);
        }
    });