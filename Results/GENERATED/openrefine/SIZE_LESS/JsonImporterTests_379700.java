IntStream.range(1, 7).forEach(i -> {
    sb.append(getTypicalElement(i));
    if (i < 6) {
        sb.append(",");
    }
});