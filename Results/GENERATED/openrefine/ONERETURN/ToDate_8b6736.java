IntStream.range(2, args.length)
        .filter(i -> !(args[i] instanceof String))
        .mapToObj(i -> new EvalError(EvalErrorMessage.invalid_non_string_format_arg(args[i].toString())))
        .findFirst()
        .ifPresent(error -> { throw error; });
        
IntStream.range(2, args.length)
        .filter(i -> args[i] instanceof String)
        .mapToObj(i -> StringUtils.trim((String) args[i]))
        .forEach(formats::add);