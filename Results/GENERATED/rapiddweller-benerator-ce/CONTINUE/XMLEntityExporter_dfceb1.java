entity.getComponents()
    .entrySet().stream()
    .filter(entry -> entry.getValue() != null)
    .filter(entry -> entry.getKey() != null && !ComplexTypeDescriptor.__SIMPLE_CONTENT.equals(entry.getKey())
            && hasSimpleType(entry.getValue()))
    .forEach(entry -> atts.addAttribute("", "", entry.getKey(), "CDATA", converter.convert(entry.getValue()));