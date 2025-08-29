for (int i = 0; i < l; i++) {
    if (testValue(JsonValueConverter.convert(a.get(i)))) {
        return true;
    }
}