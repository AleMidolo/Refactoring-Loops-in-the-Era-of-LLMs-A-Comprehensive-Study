for (int i = 0; i < l; i++) {
    if (checkValue(JsonValueConverter.convert(a.get(i)))) {
        return true;
    }
}