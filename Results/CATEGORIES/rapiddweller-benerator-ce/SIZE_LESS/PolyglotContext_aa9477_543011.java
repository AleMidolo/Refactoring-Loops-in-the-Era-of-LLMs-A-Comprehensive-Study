for (String entry : polyglotCtx.getBindings(language).getMemberKeys()) {
    migrateBeneratorContext2GraalVM(context, language, entry);
}