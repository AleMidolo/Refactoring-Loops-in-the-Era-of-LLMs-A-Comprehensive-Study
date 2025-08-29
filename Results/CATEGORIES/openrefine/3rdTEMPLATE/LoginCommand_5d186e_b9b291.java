for (Cookie cookie : cookies) {
    String name = cookie.getName();
    if (name.startsWith(prefix)) {
        result.put(name.substring(prefix.length()), getCookieValue(cookie));
    }
}