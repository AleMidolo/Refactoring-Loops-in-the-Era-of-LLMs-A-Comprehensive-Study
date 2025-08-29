_facets.stream()
        .map(this::getFilteredRecords)
        .forEach(filteredRecords -> _project.computeChoices(_project, filteredRecords));