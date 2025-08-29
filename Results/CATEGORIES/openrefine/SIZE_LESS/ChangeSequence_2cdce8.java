for (int i = _changes.length - 1; i >= 0; i--) {
    _changes[i].revert(project);
}