for (int i = 0; i < count; i++) {
    int index = JSONUtilities.getIntElement(fileSelectionIndexes, i, -1);
    if (index >= 0 && index < fileRecords.size()) {
        ObjectNode fileRecord = JSONUtilities.getObjectElement(fileRecords, index);
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
}