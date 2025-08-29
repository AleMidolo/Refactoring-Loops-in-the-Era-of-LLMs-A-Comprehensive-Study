for (HttpCookie cookie : cookies) {
    setCookie(response, prefix + cookie.getName(), cookie.getValue());
}