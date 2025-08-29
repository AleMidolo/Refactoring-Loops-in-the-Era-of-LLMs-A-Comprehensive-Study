IntStream.range(0, r.length)
    .forEach(i -> {
        if (a[i] instanceof Comparable) {
            r[i] = (Comparable) a[i];
        } else if (a[i] == null) {
            r[i] = null;
        } else {
            return new EvalError(EvalErrorMessage.expects_one_array_uniform(ControlFunctionRegistry.getFunctionName(this)));
        }
});