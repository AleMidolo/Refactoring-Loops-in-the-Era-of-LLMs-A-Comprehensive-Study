for (Entry<DateTimeFormatter, Integer> entry : acceptedFormats.entrySet()) {
    TemporalQuery<TimeValue> temporalQuery = getTemporalQuery(entry.getValue(), bceFlag, calendarIri);
    TimeValue date;
    try {
        date = entry.getKey().parse(trimmedDatestamp, temporalQuery);
    } catch (DateTimeParseException e) {
        continue;
    }
    precision = entry.getValue();
    bestDate = date;
}