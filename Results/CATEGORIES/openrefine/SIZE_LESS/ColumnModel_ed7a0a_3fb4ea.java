for (int i = _rootColumnGroups.size() - 1; i >= 0; i--) {
    if (_rootColumnGroups.get(i).parentGroup != null) {
        _rootColumnGroups.remove(i);
    }
}