IntStream.range(0, count)
    .mapToObj(i -> JSONUtilities.getObjectElement(fileRecords, i))
    .map(fileRecord -> JSONUtilities.getString(fileRecord, "format", null))
    .filter(Objects::nonNull)
    .forEach(format -> {
        formatToCount.put(format, formatToCount.getOrDefault(format, 0) + 1);
        if (formatToCount.get(format) == 1) {
            formats.add(format);
        }
    });