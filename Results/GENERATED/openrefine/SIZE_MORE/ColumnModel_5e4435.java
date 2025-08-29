_rootColumnGroups.stream()
        .skip(1)
        .forEach(g -> IntStream.range(0, _rootColumnGroups.size() - 1)
            .filter(j -> _rootColumnGroups.get(j).parentGroup == null && g.contains(_rootColumnGroups.get(j)))
            .forEach(j -> {
                _rootColumnGroups.get(j).parentGroup = g;
                g.subgroups.add(_rootColumnGroups.get(j));
            });