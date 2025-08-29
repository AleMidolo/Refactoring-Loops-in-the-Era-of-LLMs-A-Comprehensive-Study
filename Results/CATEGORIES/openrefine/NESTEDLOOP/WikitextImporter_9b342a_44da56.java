for (List<String> row : this.visitor.references) {
    for (int i = 0; i != row.size(); i++) {
        while (i >= columnReferenced.size()) {
            columnReferenced.add(false);
        }
        if (row.get(i) != null) {
            columnReferenced.set(i, true);
        }
    }
}