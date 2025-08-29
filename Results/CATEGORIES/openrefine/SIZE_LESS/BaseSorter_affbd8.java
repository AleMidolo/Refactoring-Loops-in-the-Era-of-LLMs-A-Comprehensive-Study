for (int i = 0; c == 0 && i < _comparatorWrappers.length; i++) {
    c = _comparatorWrappers[i].compare(project, o1, i1, o2, i2);
}