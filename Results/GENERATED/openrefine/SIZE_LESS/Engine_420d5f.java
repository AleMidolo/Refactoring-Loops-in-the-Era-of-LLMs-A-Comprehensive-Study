_facets.stream()
       .map(this::getFilteredRecords)
       .forEach(filteredRecords -> filteredRecords.getFacet().computeChoices(_project, filteredRecords));