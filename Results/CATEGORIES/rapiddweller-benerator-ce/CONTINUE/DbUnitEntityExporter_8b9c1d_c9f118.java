for (Map.Entry<String, Object> entry : entity.getComponents().entrySet()) {
    Object value = entry.getValue();
    if (value == null) {
        continue;
    }
    String s = toStringConverter.convert(value);
    if (s != null) {
        atts.addAttribute("", "", entry.getKey(), "CDATA", s);
    }
}