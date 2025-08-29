for (int i = 0; i < tokens.length; i++) {
    result[i] = elementParser.parse(StringUtil.trim(tokens[i]));
}