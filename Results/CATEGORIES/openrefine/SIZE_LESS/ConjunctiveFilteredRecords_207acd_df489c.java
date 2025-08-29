for (RecordFilter recordFilter : _recordFilters) {
    if (!recordFilter.filterRecord(project, record)) {
        return false;
    }
}