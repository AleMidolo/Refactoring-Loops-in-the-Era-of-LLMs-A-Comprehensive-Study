getAliases().stream()
    .filter(alias -> !newLabels.containsKey(alias.getLanguageCode()))
    .forEach(alias -> newLabels.put(alias.getLanguageCode(), alias));
    
filteredAliases.addAll(getAliases().stream()
    .filter(alias -> newLabels.containsKey(alias.getLanguageCode()))
    .collect(Collectors.toList());