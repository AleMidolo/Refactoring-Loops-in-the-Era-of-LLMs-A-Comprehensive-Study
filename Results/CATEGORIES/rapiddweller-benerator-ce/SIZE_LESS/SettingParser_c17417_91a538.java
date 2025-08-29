for (int j = 0; j < childElements.length; j++) {
    subExpressions[j] = (Expression<Object>) BeanParser.parseBeanExpression(childElements[j], false);
}