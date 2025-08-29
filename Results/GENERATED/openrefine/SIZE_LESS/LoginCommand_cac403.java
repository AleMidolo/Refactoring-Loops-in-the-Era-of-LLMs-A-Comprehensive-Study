cookieList.addAll(cookieMap.entrySet().stream()
    .filter(entry -> entry.getKey().startsWith(WIKIBASE_COOKIE_PREFIX))
    .map(entry -> new Cookie(entry.getKey().substring(WIKIBASE_COOKIE_PREFIX.length()), entry.getValue()))
    .collect(Collectors.toList()));