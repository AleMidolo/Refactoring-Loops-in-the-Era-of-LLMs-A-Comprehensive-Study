cells.stream()
    .forEach(cellData -> {
        writer.write("<td>");
        if (cellData != null && cellData.text != null) {
            if (cellData.link != null) {
                writer.write("<a href=\"");
                writer.write(StringEscapeUtils.escapeHtml4(cellData.link));
                writer.write("\">");
            }
            writer.write(StringEscapeUtils.escapeXml10(cellData.text));
            if (cellData.link != null) {
                writer.write("</a>");
            }
        }
        writer.write("</td>");
    });