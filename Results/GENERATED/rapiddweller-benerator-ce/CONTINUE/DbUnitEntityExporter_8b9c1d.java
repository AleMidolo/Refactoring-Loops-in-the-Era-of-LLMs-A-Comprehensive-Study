entity.getComponents().entrySet().stream()
    .filter(entry -> entry.getValue() != null)
    .map(entry -> toStringConverter.convert(entry.getValue()))
    .filter(s -> s != null)
    .forEach(s -> atts.addAttribute("", "", entry.getKey(), "CDATA", s));