for (int i = 0; i < cells.size(); i++) {
    Cell c = r.createCell(i);
    if (i == (maxColumns - 1) && cells.size() > maxColumns) {
        c.setCellValue("ERROR: TOO MANY COLUMNS");
        break;
    } else {
        CellData cellData = cells.get(i);
        if (cellData != null && cellData.text != null && cellData.value != null) {
            Object v = cellData.value;
            if (v instanceof Number) {
                c.setCellValue(((Number) v).doubleValue());
            } else if (v instanceof Boolean) {
                c.setCellValue(((Boolean) v).booleanValue());
            } else if (v instanceof OffsetDateTime) {
                OffsetDateTime odt = (OffsetDateTime) v;
                c.setCellValue(ParsingUtilities.offsetDateTimeToCalendar(odt));
                c.setCellStyle(dateStyle);
            } else {
                String s = cellData.text;
                if (s.length() > maxTextLength) {
                    s = s.substring(0, maxTextLength);
                }
                c.setCellValue(s);
            }
            if (cellData.link != null) {
                try {
                    Hyperlink hl = wb.getCreationHelper().createHyperlink(HyperlinkType.URL);
                    hl.setLabel(cellData.text);
                    hl.setAddress(cellData.link);
                    c.setHyperlink(hl);
                } catch (IllegalArgumentException e) {
                }
            }
        }
    }
}