IntStream.range(0, a.length)
    .forEach(i -> {
        if (i > 0) {
            sb.append(", ");
        }
        writeValue(sb, a[i], true);
    });