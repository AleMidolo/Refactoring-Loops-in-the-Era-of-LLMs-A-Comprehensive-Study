_rootColumnGroups.stream()
    .skip(1)
    .forEach(g -> _rootColumnGroups.stream()
        .filter(g2 -> g2.parentGroup == null && g.contains(g2))
        .forEach(g2 -> {
            g2.parentGroup = g;
            g.subgroups.add(g2);
        })
    );