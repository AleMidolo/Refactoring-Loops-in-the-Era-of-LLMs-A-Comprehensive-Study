attributes.entrySet().stream().forEach(entry -> {
    if (wrapAttribs && i > 0) {
        writer.append(TAB).append(TAB);
    } else {
        writer.append(' ');
    }
    writer.append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
    if (wrapAttribs && i < attributes.size() - 1) {
        writer.append('\n');
    }
    i++;
});