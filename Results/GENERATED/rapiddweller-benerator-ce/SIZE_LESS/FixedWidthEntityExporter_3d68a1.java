this.formats.entrySet().stream()
    .forEach(entry -> this.formatters.put(entry.getKey(), new FWRecordFormatter(entry.getValue(), getNullString(), locale));