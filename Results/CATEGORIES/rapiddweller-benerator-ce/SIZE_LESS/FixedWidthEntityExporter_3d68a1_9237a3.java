for (Map.Entry<String, String> entry : this.formats.entrySet()) {
    this.formatters.put(entry.getKey(), new FWRecordFormatter(entry.getValue(), getNullString(), locale));
}