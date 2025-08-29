acceptedFormats.entrySet().stream()
    .map(entry -> {
        TemporalQuery<TimeValue> temporalQuery = getTemporalQuery(entry.getValue(), bceFlag, calendarIri);
        try {
            return entry.getKey().parse(trimmedDatestamp, temporalQuery);
        } catch (DateTimeParseException e) {
            return null;
        }
    })
    .filter(Objects::nonNull)
    .findFirst()
    .ifPresent(date -> {
        precision = acceptedFormats.get(date).getValue();
        bestDate = date;
    });