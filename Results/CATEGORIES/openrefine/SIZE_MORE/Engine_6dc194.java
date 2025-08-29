for (Facet facet : _facets) {
    if (facet != except) {
        RecordFilter recordFilter = facet.getRecordFilter(_project);
        if (recordFilter != null) {
            cfr.add(recordFilter);
        }
    }
}