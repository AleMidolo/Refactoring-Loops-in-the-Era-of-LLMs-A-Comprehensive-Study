for (int i = 0; i < args.length; i++) {
    if (!(args[i] instanceof Number)) {
        return new EvalError(EvalErrorMessage.expects_param_i_number(ControlFunctionRegistry.getFunctionName(this), i + 1));
    }
    int num = ((Number) args[i]).intValue();
    sum += num;
    product = product.multiply(BigIntegerMath.factorial(num));
}