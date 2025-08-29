_facets.stream()
        .map(this::getFilteredRows)
        .forEach(filteredRows -> _facets.computeChoices(_project, filteredRows));