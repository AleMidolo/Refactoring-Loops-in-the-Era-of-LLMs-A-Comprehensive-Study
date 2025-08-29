for (Map.Entry<String, String> entry : attributes.entrySet()) {
    writer.append(' ').append(entry.getKey()).append("=\"").append(entry.getValue()).append('"');
}