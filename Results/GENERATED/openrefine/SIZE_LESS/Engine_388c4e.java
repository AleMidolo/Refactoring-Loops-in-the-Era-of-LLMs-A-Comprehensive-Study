_facets.stream()
        .map(this::getFilteredRows)
        .forEach(filteredRows -> _project.computeChoices(filteredRows));