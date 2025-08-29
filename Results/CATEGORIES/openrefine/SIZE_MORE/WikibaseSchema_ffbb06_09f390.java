for (WbExpression<? extends EntityEdit> entityEdit : entityEditExprs) {
    if (entityEdit == null) {
        validationContext.addError("Empty entity edit");
    } else {
        validationContext.enter(new PathElement(PathElement.Type.ENTITY, index));
        entityEdit.validate(validationContext);
        validationContext.leave();
    }
    index++;
}