cells.stream()
    .forEach(cellData -> {
        writer.write("<td>");
        Optional.ofNullable(cellData)
            .map(cd -> cd.text)
            .ifPresent(text -> {
                Optional.ofNullable(cellData.link)
                    .ifPresent(link -> {
                        writer.write("<a href=\"");
                        writer.write(StringEscapeUtils.escapeHtml4(link));
                        writer.write("\">");
                    });
                writer.write(StringEscapeUtils.escapeXml10(text));
                Optional.ofNullable(cellData.link)
                    .ifPresent(link -> writer.write("</a>"));
            });
        writer.write("</td>");
    });