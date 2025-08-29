for (Object v : a) {
    if (checkValue(v instanceof String ? ((String) v) : v.toString())) {
        return !invert;
    }
}