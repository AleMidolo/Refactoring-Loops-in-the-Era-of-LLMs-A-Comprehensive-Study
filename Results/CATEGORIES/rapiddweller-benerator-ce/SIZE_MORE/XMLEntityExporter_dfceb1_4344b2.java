for (Map.Entry<String, Object> entry : entity.getComponents().entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    if (value == null) {
        continue;
    }
    if (key != null && !ComplexTypeDescriptor.__SIMPLE_CONTENT.equals(key) && hasSimpleType(value)) {
        atts.addAttribute("", "", entry.getKey(), "CDATA", converter.convert(value));
    }
}