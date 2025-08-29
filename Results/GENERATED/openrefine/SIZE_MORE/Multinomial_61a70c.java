```
IntStream.range(0, args.length)
    .mapToObj(i -> {
        if (!(args[i] instanceof Number)) {
            return new EvalError(EvalErrorMessage.expects_param_i_number(ControlFunctionRegistry.getFunctionName(this), i + 1));
        }
        return ((Number) args[i]).intValue();
    })
    .forEach(num -> {
        sum += num;
        product = product.multiply(BigIntegerMath.factorial(num));
    });
```