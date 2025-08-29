for (Statement subStatement : subStatements) {
    if (subStatement instanceof Element) {
        ((Element) subStatement).accept(visitor);
    } else {
        visitor.visit(subStatement);
    }
}