Arrays.stream(args)
        .filter(arg -> !(arg instanceof Number))
        .findFirst()
        .ifPresent(arg -> new EvalError(EvalErrorMessage.expects_param_i_number(ControlFunctionRegistry.getFunctionName(this), Arrays.asList(args).indexOf(arg) + 1)));
int sum = Arrays.stream(args)
        .filter(arg -> arg instanceof Number)
        .mapToInt(arg -> ((Number) arg).intValue())
        .sum();
BigInteger product = Arrays.stream(args)
        .filter(arg -> arg instanceof Number)
        .map(arg -> ((Number) arg).intValue())
        .map(BigIntegerMath::factorial)
        .reduce(BigInteger.ONE, BigInteger::multiply);