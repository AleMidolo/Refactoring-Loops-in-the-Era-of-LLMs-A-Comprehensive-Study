Cookie cookie = cookies.stream()
    .filter(c -> name.equals(c.getName()))
    .findFirst()
    .orElse(null);