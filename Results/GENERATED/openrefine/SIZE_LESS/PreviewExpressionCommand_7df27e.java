list.stream()
    .skip(1)
    .forEach(item -> {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        writeValue(sb, item, true);
    });