s.chars()
    .mapToObj(i -> (char) i)
    .forEach(c -> {
        if ('"' == c) {
            inQuote = !inQuote;
        }
        if (!Character.isLetterOrDigit(c) && !"\"' .-".contains(String.valueOf(c)) && (!handleQuotes || !inQuote)) {
            Separator separator = separatorMap.get(c);
            if (separator == null) {
                separator = new Separator();
                separator.separator = c;
                separatorMap.put(c, separator);
                separators.add(separator);
            }
            separator.currentLineCount++;
        }
    });