for (Map.Entry<String, String> attribute : attributes.entrySet()) {
    if (wrapAttribs && i > 0) {
        writer.append(TAB).append(TAB);
    } else {
        writer.append(' ');
    }
    writer.append(attribute.getKey()).append("=\"").append(attribute.getValue()).append("\"");
    if (wrapAttribs && i < attributes.size() - 1) {
        writer.append('\n');
    }
    i++;
}