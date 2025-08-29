_rootColumnGroups.stream()
        .skip(1)
        .flatMap(g -> IntStream.range(_rootColumnGroups.indexOf(g), _rootColumnGroups.size())
                .mapToObj(j -> _rootColumnGroups.get(j))
                .filter(g2 -> g2.parentGroup == null && g.contains(g2)))
        .forEach(g2 -> {
            g2.parentGroup = g;
            g.subgroups.add(g2);
        });