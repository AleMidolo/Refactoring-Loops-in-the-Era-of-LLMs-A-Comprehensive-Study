IntStream.range(0, Math.min(5, fileRecords.size()))
    .mapToObj(i -> {
        ObjectNode fileRecord = fileRecords.get(i);
        String encoding = ImportingUtilities.getEncoding(fileRecord);
        String location = JSONUtilities.getString(fileRecord, "location", null);
        if (location != null) {
            File file = new File(job.getRawDataDir(), location);
            Separator separator = guessSeparator(file, encoding, true);
            CsvFormat format = guessFormat(file, encoding);
            if (format != null) {
                if (separator != null) {
                    if (format.getDelimiter() != separator.separator) {
                        logger.warn("Delimiter guesses disagree - uniVocity: '{}' - internal: '{}'", format.getDelimiter(), separator.separator);
                    }
                    return StringEscapeUtils.escapeJava(Character.toString(separator.separator));
                } else {
                    return StringEscapeUtils.escapeJava(format.getDelimiterString());
                }
            } else {
                if (separator != null) {
                    return StringEscapeUtils.escapeJava(Character.toString(separator.separator));
                }
            }
        }
        return "";
    })
    .filter(str -> !str.isEmpty())
    .findFirst()
    .orElse("");