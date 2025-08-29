for (int i = 0; i < count; i++) {
    ObjectNode fileRecord = JSONUtilities.getObjectElement(fileRecords, i);
    String format = JSONUtilities.getString(fileRecord, "format", null);
    if (format != null && format.equals(bestFormat)) {
        JSONUtilities.append(fileSelectionIndexes, i);
    }
}