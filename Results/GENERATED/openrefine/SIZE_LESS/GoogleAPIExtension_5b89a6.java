return Arrays.stream(parts)
    .filter(part -> part.startsWith(key + "="))
    .map(part -> part.substring(key.length() + 1))
    .findFirst()
    .orElse(null);