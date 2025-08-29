for (String attrName : XMLUtil.getAttributes(element).keySet()) {
    try {
        Expression<String> expression = parseScriptableStringAttribute(attrName, element);
        String propertyName = normalizeAttributeName(attrName);
        PropertyDescriptor descriptor = BeanUtil.getPropertyDescriptor(bean.getClass(), propertyName);
        Object value = expression;
        if (!Expression.class.equals(descriptor.getPropertyType())) {
            value = ExpressionUtil.evaluate(expression, null);
        }
        BeanUtil.setPropertyValue(bean, propertyName, value, false);
    } catch (Exception e) {
        throw BeneratorExceptionFactory.getInstance().illegalXmlAttributeValue("Error processing '" + attrName + "' attribute of " + XMLUtil.format(element), e, BeneratorErrorIds.UNSPECIFIC, element.getAttributeNode(attrName));
    }
}