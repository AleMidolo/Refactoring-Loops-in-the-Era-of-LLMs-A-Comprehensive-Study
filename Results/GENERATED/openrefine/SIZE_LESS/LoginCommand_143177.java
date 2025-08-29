cookies.stream()
    .forEach(cookie -> setCookie(response, prefix + cookie.getName(), cookie.getValue()));