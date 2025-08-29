cookies.stream()
    .filter(cookie -> cookie.getName().startsWith(prefix))
    .collect(Collectors.toMap(cookie -> cookie.getName().substring(prefix.length()), this::getCookieValue, (v1, v2) -> v1));