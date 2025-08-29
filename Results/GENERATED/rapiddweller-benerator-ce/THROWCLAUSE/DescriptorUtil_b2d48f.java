beans.stream()
    .map(bean -> {
        Validator validator;
        if (bean instanceof Validator) {
            validator = (Validator<?>) bean;
        } else if (bean instanceof ConstraintValidator) {
            validator = new BeanConstraintValidator((ConstraintValidator) bean);
        } else {
            throw BeneratorExceptionFactory.getInstance().configurationError("Unknown validator type: " + BeanUtil.simpleClassName(bean));
        }
        return validator;
    })
    .reduce((result, validator) -> {
        if (result == null) {
            return validator;
        } else if (result instanceof AndValidator) {
            ((AndValidator) result).add(validator);
            return result;
        } else {
            return new AndValidator(result, validator);
        }
    })
    .orElse(null);