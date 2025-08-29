for (Object match : _matches) {
    if (testValue(v, match)) {
        return true;
    }
}