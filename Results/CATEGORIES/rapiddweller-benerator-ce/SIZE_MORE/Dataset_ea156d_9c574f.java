for (Dataset subSet : subSets) {
    if (searchedChildName.equals(subSet.getName())) {
        return true;
    }
    if (subSet.contains(searchedChildName)) {
        return true;
    }
}