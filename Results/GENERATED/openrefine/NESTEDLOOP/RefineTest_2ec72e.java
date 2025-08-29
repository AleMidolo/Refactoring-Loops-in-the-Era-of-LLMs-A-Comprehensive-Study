project.rows.forEach(r -> {
    StringBuilder sb = new StringBuilder();
    IntStream.range(0, r.cells.size())
                .mapToObj(i -> r.getCell(i))
                .forEach(c -> sb.append(c != null ? c.value : "null").append("; "));
    logger.info(sb.toString());
});