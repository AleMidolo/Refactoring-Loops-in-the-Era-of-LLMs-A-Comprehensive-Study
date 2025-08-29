IntStream.range(0, count)
    .mapToObj(i -> JSONUtilities.getObjectElement(fileRecords, i))
    .filter(fileRecord -> {
        String format = JSONUtilities.getString(fileRecord, "format", null);
        return format != null && format.equals(bestFormat);
    })
    .forEach(fileSelectionIndexes::append);