for (Object bean : beans) {
    Validator validator;
    if (bean instanceof Validator) {
        validator = (Validator<?>) bean;
    } else if (bean instanceof ConstraintValidator) {
        validator = new BeanConstraintValidator((ConstraintValidator) bean);
    } else {
        throw BeneratorExceptionFactory.getInstance().configurationError("Unknown validator type: " + BeanUtil.simpleClassName(bean));
    }
    if (result == null) {
        result = validator;
    } else if (result instanceof AndValidator) {
        ((AndValidator) result).add(validator);
    } else {
        result = new AndValidator(result, validator);
    }
}