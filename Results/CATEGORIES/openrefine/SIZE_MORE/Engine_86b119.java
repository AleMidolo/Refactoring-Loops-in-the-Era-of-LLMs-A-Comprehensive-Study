for (Facet facet : _facets) {
    if (facet != except) {
        RowFilter rowFilter = facet.getRowFilter(_project);
        if (rowFilter != null) {
            cfr.add(rowFilter);
        }
    }
}