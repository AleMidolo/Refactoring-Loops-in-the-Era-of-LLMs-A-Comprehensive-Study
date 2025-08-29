parsers.forEach(parser -> {
    parseContext.addParser(parser);
    BeneratorFactory.getInstance().addCustomParser(parser);
});