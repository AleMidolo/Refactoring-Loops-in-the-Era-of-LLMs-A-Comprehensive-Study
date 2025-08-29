attributes.entrySet().stream()
    .forEach(entry -> writer.append(' ').append(entry.getKey()).append("=\"").append(entry.getValue()).append('"'));