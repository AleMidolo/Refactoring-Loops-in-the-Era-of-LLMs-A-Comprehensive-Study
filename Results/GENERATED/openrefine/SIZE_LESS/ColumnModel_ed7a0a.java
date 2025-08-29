
_rootColumnGroups.stream()
    .filter(group -> group.parentGroup != null)
    .forEach(group -> _rootColumnGroups.remove(group));