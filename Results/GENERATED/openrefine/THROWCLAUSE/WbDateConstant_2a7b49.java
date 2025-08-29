acceptedFormats.entrySet().stream()
    .map(entry -> {
        TemporalQuery<TimeValue> temporalQuery = getTemporalQuery(entry.getValue(), bceFlag, calendarIri);
        try {
            TimeValue date = entry.getKey().parse(trimmedDatestamp, temporalQuery);
            precision = entry.getValue();
            bestDate = date;
        } catch (DateTimeParseException e) {
            // Handle exception or continue as needed
        }
        return null;
    }).collect(Collectors.toList());