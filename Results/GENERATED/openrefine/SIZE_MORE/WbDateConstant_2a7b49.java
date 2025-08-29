acceptedFormats.entrySet().stream()
    .map(entry -> {
        TemporalQuery<TimeValue> temporalQuery = getTemporalQuery(entry.getValue(), bceFlag, calendarIri);
        try {
            TimeValue date = entry.getKey().parse(trimmedDatestamp, temporalQuery);
            return new AbstractMap.SimpleEntry<>(entry.getValue(), date);
        } catch (DateTimeParseException e) {
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(entry -> {
        precision = entry.getKey();
        bestDate = entry.getValue();
    });