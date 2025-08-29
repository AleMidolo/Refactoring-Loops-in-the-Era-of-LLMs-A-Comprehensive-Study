IntStream.range(0, _args.length)
    .mapToObj(i -> _args[i].evaluate(bindings))
    .filter(ExpressionUtils::isError)
    .findFirst()
    .orElseGet(() -> {
        for (int i = 0; i < _args.length; i++) {
            args[i] = _args[i].evaluate(bindings);
        }
        return null;
    });