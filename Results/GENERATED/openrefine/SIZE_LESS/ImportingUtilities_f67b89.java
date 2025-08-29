ImportingManager.formatToRecord.entrySet().stream()
    .filter(entry -> {
        Format record = entry.getValue();
        return record.uiClass != null && record.parser != null && record.download == download;
    })
    .forEach(entry -> {
        String format = entry.getKey();
        formats.add(format);
        formatToSegments.put(format, format.split("/"));
    });