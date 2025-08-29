for (int i = 0; i < tokens.length; i++) {
    if (!unique || !sources[i].contains(tokens[i])) {
        sources[i].addValue(tokens[i]);
    }
}