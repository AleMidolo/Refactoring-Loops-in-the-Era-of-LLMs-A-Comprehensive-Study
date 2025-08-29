for (int i = 0; i < count; i++) {
    ObjectNode fileRecord = JSONUtilities.getObjectElement(fileRecords, i);
    String format = JSONUtilities.getString(fileRecord, "format", null);
    if (format != null) {
        if (formatToCount.containsKey(format)) {
            formatToCount.put(format, formatToCount.get(format) + 1);
        } else {
            formatToCount.put(format, 1);
            formats.add(format);
        }
    }
}