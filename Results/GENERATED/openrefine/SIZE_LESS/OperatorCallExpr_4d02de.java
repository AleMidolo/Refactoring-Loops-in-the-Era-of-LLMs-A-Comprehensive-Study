Arrays.setAll(args, i -> {
    Object v = _args[i].evaluate(bindings);
    return ExpressionUtils.isError(v) ? v : v;
});