_facets.stream()
        .map(this::getFilteredRows)
        .forEach(filteredRows -> filteredRows.getFacet().computeChoices(_project, filteredRows));