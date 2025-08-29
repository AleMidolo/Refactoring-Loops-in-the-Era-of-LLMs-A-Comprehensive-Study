for (WbReferenceExpr reference : referenceExprs) {
    if (reference == null) {
        validation.addError("Empty reference in statement");
    } else {
        validation.enter(new PathElement(Type.REFERENCE, index));
        reference.validate(validation);
        validation.leave();
    }
    index++;
}