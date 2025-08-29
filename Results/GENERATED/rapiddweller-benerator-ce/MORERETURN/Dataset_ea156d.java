return subSets.stream()
    .anyMatch(subSet -> searchedChildName.equals(subSet.getName()) || subSet.contains(searchedChildName));