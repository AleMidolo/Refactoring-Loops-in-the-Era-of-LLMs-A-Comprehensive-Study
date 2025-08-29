for (int i = 0; i < count; i++) {
    _keyMakers[i] = _criteria[i].createKeyMaker();
    _comparatorWrappers[i] = new ComparatorWrapper(i);
}