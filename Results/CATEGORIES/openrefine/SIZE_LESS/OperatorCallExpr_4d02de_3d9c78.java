for (int i = 0; i < _args.length; i++) {
    Object v = _args[i].evaluate(bindings);
    if (ExpressionUtils.isError(v)) {
        return v;
    }
    args[i] = v;
}