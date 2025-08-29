for (XMLStatementParser parser : parsers) {
    parseContext.addParser(parser);
    BeneratorFactory.getInstance().addCustomParser(parser);
}