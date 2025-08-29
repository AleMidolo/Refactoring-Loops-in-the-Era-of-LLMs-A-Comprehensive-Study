_facets.stream()
        .filter(facet -> facet != except)
        .map(facet -> facet.getRowFilter(_project))
        .filter(Objects::nonNull)
        .forEach(cfr::add);