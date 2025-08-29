for (String format : ImportingManager.formatToRecord.keySet()) {
    Format record = ImportingManager.formatToRecord.get(format);
    if (record.uiClass != null && record.parser != null && record.download == download) {
        formats.add(format);
        formatToSegments.put(format, format.split("/"));
    }
}