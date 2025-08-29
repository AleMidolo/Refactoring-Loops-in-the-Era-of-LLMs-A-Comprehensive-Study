ids.stream()
        .filter(id -> records.has(id) && records.get(id) instanceof ObjectNode)
        .forEach(id -> {
            ObjectNode record = (ObjectNode) records.get(id);
            ReconciledDataExtensionJob.DataExtension ext = collectResult(record, reconCandidateMap);
            if (ext != null) {
                map.put(id, ext);
            }
        });