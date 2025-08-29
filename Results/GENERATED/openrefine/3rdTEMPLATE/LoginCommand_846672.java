cookies.stream()
        .filter(cookie -> cookie.getName().startsWith(prefix))
        .forEach(cookie -> result.put(cookie.getName().substring(prefix.length()), getCookieValue(cookie));