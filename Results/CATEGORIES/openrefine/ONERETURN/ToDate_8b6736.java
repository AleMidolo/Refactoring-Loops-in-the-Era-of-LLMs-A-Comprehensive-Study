for (int i = 2; i < args.length; i++) {
    if (!(args[i] instanceof String)) {
        return new EvalError(EvalErrorMessage.invalid_non_string_format_arg(args[i].toString()));
    }
    formats.add(StringUtils.trim((String) args[i]));
}