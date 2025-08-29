ImportingManager.formatToRecord.keySet()
    .stream()
    .map(format -> ImportingManager.formatToRecord.get(format))
    .filter(record -> record.uiClass != null && record.parser != null && record.download == download)
    .forEach(record -> {
        formats.add(format);
        formatToSegments.put(format, format.split("/"));
    });