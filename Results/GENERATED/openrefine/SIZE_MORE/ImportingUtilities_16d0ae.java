IntStream.range(0, count)
    .map(i -> JSONUtilities.getIntElement(fileSelectionIndexes, i, -1))
    .filter(index -> index >= 0 && index < fileRecords.size())
    .mapToObj(index -> JSONUtilities.getObjectElement(fileRecords, index))
    .map(fileRecord -> JSONUtilities.getString(fileRecord, "format", null))
    .filter(Objects::nonNull)
    .forEach(format -> {
        formatToCount.put(format, formatToCount.getOrDefault(format, 0) + 1);
        formats.add(format);
    });