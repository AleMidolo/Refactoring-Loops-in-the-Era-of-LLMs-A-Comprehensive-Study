for (MonolingualTextValue alias : getAliases()) {
    if (!newLabels.containsKey(alias.getLanguageCode())) {
        newLabels.put(alias.getLanguageCode(), alias);
    } else {
        filteredAliases.add(alias);
    }
}