project.rows.stream()
    .forEach(r -> {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, r.cells.size())
            .forEach(i -> {
                Cell c = r.getCell(i);
                sb.append(c != null ? c.value : "null")
                    .append("; ");
            });
        logger.info(sb.toString());
    });