for (MonolingualTextValue alias : other.getAliases()) {
    List<MonolingualTextValue> aliases = newAliases.get(alias.getLanguageCode());
    if (aliases == null) {
        aliases = new LinkedList<>();
        newAliases.put(alias.getLanguageCode(), aliases);
    }
    if (!aliases.contains(alias)) {
        aliases.add(alias);
    }
}