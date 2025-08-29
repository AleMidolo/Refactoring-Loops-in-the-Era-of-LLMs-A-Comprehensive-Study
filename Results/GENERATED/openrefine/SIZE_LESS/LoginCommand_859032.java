cookies.stream()
    .filter(cookie -> cookie.getName().startsWith(toRemovePrefix))
    .forEach(cookie -> removeCookie(response, cookie.getName()));