IntStream.range(2, args.length)
    .mapToObj(i -> args[i])
    .filter(arg -> !(arg instanceof String))
    .map(arg -> new EvalError(EvalErrorMessage.invalid_non_string_format_arg(arg.toString())))
    .collect(Collectors.toList()).forEach(formats::add); 