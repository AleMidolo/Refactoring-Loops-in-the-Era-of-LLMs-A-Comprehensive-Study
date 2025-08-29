pairs.forEach(pairString -> {
    int equal = pairString.indexOf('=');
    String name = (equal >= 0) ? pairString.substring(0, equal) : "";
    String value = (equal >= 0) ? ParsingUtilities.decode(pairString.substring(equal + 1)) : "";
    p.put(name, value);
});