getAliases().stream()
    .filter(alias -> !newLabels.containsKey(alias.getLanguageCode()))
    .forEach(alias -> newLabels.put(alias.getLanguageCode(), alias));
    
List<MonolingualTextValue> filteredAliases = getAliases().stream()
    .filter(alias -> newLabels.containsKey(alias.getLanguageCode()))
    .collect(Collectors.toList());