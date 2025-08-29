return Arrays.stream(parts)
    .filter(part -> part.startsWith(key + "="))
    .findFirst()
    .map(part -> part.substring(key.length() + 1))
    .orElse(null);