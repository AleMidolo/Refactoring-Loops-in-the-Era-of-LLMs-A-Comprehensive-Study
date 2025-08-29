for (Object arg : args) {
    arg = LiteralParserConverter.parse((String) arg);
    if (arg instanceof Date) {
        sum += ((Date) arg).getTime();
    } else if (arg instanceof Timestamp) {
        sum += ((Timestamp) arg).getTime();
    } else if (arg instanceof Number) {
        sum += ((Number) arg).longValue();
    } else if (arg != null) {
        throw BeneratorExceptionFactory.getInstance().illegalArgument("Not a supported date type: " + arg.getClass());
    }
}