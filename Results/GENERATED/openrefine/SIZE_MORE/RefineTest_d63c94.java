r.cells.stream()
    .map(r::getCell)
    .filter(Objects::nonNull)
    .forEach(c -> {
        sb.append(c.value);
        sb.append("; ");
    });