for (WbStatementExpr statement : statementExprs) {
    validation.enter(new PathElement(Type.STATEMENT, propertyName));
    if (statement != null) {
        statement.validate(validation);
    } else {
        validation.addError("Empty statement");
    }
    validation.leave();
}