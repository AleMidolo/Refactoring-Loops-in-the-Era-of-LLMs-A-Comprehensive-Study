for (int i = 0; i < attributes.getLength(); i++) {
    Attr attr = (Attr) attributes.item(i);
    String detailValue = parseStringAttribute(attr, context);
    descriptor.setDetailValue(attr.getName(), detailValue);
}