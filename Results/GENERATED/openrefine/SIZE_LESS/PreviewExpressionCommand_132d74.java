IntStream.range(0, list.size())
    .forEach(i -> {
        if (i > 0) {
            sb.append(", ");
        }
        writeValue(sb, list.get(i), true);
    });