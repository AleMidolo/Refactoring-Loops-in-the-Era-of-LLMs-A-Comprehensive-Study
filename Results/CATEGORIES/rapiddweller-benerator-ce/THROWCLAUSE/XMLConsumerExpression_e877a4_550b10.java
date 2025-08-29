for (Element consumerElement : consumerElements) {
    BeanSpec beanSpec;
    if (consumerElement.hasAttribute(ATT_REF)) {
        String ref = parseStringAttribute(consumerElement, ATT_REF, context);
        beanSpec = BeanSpec.createReference(beneratorContext.get(ref));
    } else if (consumerElement.hasAttribute(ATT_CLASS) || consumerElement.hasAttribute(ATT_SPEC)) {
        beanSpec = BeanParser.resolveLocalBeanExpression(consumerElement, beneratorContext);
    } else {
        throw BeneratorExceptionFactory.getInstance().syntaxErrorForXmlElement("Can't handle this", consumerElement);
    }
    addConsumer(beanSpec, beneratorContext, consumerChain);
}