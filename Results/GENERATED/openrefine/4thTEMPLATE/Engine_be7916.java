_facets.stream()
    .map(this::getFilteredRecords)
    .forEach(filteredRecords -> filteredRecords.computeChoices(_project));