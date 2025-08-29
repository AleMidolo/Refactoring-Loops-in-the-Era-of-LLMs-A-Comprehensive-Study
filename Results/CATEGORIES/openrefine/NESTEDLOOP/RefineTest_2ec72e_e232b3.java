for (Row r : project.rows) {
    sb = new StringBuilder();
    for (int i = 0; i < r.cells.size(); i++) {
        Cell c = r.getCell(i);
        if (c != null) {
            sb.append(c.value);
            sb.append("; ");
        } else {
            sb.append("null; ");
        }
    }
    logger.info(sb.toString());
}