for (Cookie cookie : cookies) {
    if (cookie.getName().startsWith(toRemovePrefix)) {
        removeCookie(response, cookie.getName());
    }
}