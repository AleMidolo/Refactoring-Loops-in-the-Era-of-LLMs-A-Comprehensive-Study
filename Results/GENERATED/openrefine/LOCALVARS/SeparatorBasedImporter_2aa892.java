s.chars().forEach(i -> {
    char c = (char) i;
    if ('"' == c) {
        inQuote = !inQuote;
    }
    if (!Character.isLetterOrDigit(c) && !"\"' .-".contains(String.valueOf(c)) && (!handleQuotes || !inQuote)) {
        Separator separator = separatorMap.computeIfAbsent(c, k -> new Separator());
        separator.separator = c;
        separatorMap.put(c, separator);
        separators.add(separator);
        separator.currentLineCount++;
    }
});  