for (Iterator<Map.Entry<String, ProjectLookup>> it = _lookups.entrySet().iterator(); it.hasNext(); ) {
    Map.Entry<String, ProjectLookup> entry = it.next();
    ProjectLookup lookup = entry.getValue();
    if (lookup.targetProjectID == projectID && lookup.targetColumnName.equals(columnName)) {
        it.remove();
    }
}