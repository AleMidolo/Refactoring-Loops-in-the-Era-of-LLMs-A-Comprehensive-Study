for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if ('"' == c) {
        inQuote = !inQuote;
    }
    if (!Character.isLetterOrDigit(c) && !"\"' .-".contains(s.subSequence(i, i + 1)) && (!handleQuotes || !inQuote)) {
        Separator separator = separatorMap.get(c);
        if (separator == null) {
            separator = new Separator();
            separator.separator = c;
            separatorMap.put(c, separator);
            separators.add(separator);
        }
        separator.currentLineCount++;
    }
}