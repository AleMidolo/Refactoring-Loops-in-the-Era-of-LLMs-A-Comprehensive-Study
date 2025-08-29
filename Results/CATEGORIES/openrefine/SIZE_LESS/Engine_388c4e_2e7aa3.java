for (Facet facet : _facets) {
    FilteredRows filteredRows = getFilteredRows(facet);
    facet.computeChoices(_project, filteredRows);
}