IntStream.range(0, count)
    .mapToObj(i -> JSONUtilities.getIntElement(fileSelectionIndexes, i, -1))
    .filter(index -> index >= 0 && index < fileRecords.size())
    .map(index -> JSONUtilities.getObjectElement(fileRecords, index))
    .map(fileRecord -> JSONUtilities.getString(fileRecord, "format", null))
    .filter(Objects::nonNull)
    .forEach(format -> {
        if (formatToCount.containsKey(format)) {
            formatToCount.put(format, formatToCount.get(format) + 1);
        } else {
            formatToCount.put(format, 1);
            formats.add(format);
        }
});