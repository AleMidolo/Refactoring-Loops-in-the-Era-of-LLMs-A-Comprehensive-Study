for (String id : ids) {
    if (records.has(id) && records.get(id) instanceof ObjectNode) {
        ObjectNode record = (ObjectNode) records.get(id);
        ReconciledDataExtensionJob.DataExtension ext = collectResult(record, reconCandidateMap);
        if (ext != null) {
            map.put(id, ext);
        }
    }
}