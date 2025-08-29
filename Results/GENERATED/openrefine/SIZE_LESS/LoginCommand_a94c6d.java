cookieMap.entrySet()
    .stream()
    .filter(entry -> entry.getKey().startsWith(WIKIBASE_COOKIE_PREFIX))
    .forEach(entry -> {
        String name = entry.getKey().substring(WIKIBASE_COOKIE_PREFIX.length());
        Cookie newCookie = new Cookie(name, entry.getValue());
        cookieList.add(newCookie);
    });