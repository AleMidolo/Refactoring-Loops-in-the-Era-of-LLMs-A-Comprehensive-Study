_facets.stream()
       .map(this::getFilteredRecords)
       .forEach(filteredRecords -> _facets.computeChoices(_project, filteredRecords));