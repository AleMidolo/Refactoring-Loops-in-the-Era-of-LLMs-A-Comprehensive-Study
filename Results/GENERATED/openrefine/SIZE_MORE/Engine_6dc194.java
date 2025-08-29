_facets.stream()
        .filter(facet -> facet != except)
        .map(facet -> facet.getRecordFilter(_project))
        .filter(Objects::nonNull)
        .forEach(cfr::add);