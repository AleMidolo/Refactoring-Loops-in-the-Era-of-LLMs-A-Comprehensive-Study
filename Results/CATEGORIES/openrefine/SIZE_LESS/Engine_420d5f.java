for (Facet facet : _facets) {
    FilteredRecords filteredRecords = getFilteredRecords(facet);
    facet.computeChoices(_project, filteredRecords);
}