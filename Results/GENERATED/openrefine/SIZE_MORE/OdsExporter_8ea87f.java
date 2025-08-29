cells.stream()
    .filter(cellData -> cellData != null && cellData.text != null && cellData.value != null)
    .forEach(cellData -> {
        OdfTableCell c = r.getCellByIndex(cells.indexOf(cellData));
        Object v = cellData.value;
        if (v instanceof Number) {
            c.setDoubleValue(((Number) v).doubleValue());
        } else if (v instanceof Boolean) {
            c.setBooleanValue(((Boolean) v).booleanValue());
        } else if (v instanceof OffsetDateTime) {
            OffsetDateTime odt = (OffsetDateTime) v;
            c.setDateValue(ParsingUtilities.offsetDateTimeToCalendar(odt));
        } else {
            c.setStringValue(cellData.text);
        }
        if (cellData.link != null) {
        }
    });