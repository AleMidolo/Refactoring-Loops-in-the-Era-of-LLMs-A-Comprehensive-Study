polyglotCtx.getBindings(language).getMemberKeys().stream()
    .forEach(entry -> migrateBeneratorContext2GraalVM(context, language, entry));