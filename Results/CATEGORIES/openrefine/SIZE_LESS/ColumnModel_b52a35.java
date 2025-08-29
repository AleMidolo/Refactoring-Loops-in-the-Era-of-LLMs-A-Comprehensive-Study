for (int j = i + 1; j < _rootColumnGroups.size(); j++) {
    ColumnGroup g2 = _rootColumnGroups.get(j);
    if (g2.parentGroup == null && g.contains(g2)) {
        g2.parentGroup = g;
        g.subgroups.add(g2);
    }
}