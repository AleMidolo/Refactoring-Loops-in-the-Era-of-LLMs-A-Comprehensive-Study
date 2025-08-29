Arrays.stream(args)
    .filter(arg -> !(arg instanceof Number))
    .findFirst()
    .ifPresent(arg -> new EvalError(EvalErrorMessage.expects_param_i_number(ControlFunctionRegistry.getFunctionName(this), Arrays.asList(args).indexOf(arg) + 1)));
int sum = Arrays.stream(args)
    .map(arg -> ((Number) arg).intValue())
    .reduce(0, Integer::sum);
BigInteger product = Arrays.stream(args)
    .map(arg -> ((Number) arg).intValue())
    .map(BigIntegerMath::factorial)
    .reduce(BigInteger.ONE, BigInteger::multiply);