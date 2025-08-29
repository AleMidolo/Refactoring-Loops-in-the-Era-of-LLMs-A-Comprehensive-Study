for (Map.Entry<String, String> entry : cookieMap.entrySet()) {
    if (entry.getKey().startsWith(WIKIBASE_COOKIE_PREFIX)) {
        String name = entry.getKey().substring(WIKIBASE_COOKIE_PREFIX.length());
        Cookie newCookie = new Cookie(name, entry.getValue());
        cookieList.add(newCookie);
    }
}