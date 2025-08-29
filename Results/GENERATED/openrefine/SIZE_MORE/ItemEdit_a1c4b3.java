other.getAliases().forEach(alias -> {
    List<MonolingualTextValue> aliases = newAliases.computeIfAbsent(alias.getLanguageCode(), k -> new LinkedList<>());
    if (!aliases.contains(alias)) {
        aliases.add(alias);
    }
});