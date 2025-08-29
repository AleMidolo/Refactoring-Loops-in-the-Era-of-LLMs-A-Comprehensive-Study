for (Object val : collection) {
    if (val instanceof Document) {
        results.add(convertToArray((Document) val));
    } else if (val instanceof Collection) {
        results.add(convertCollection((Collection<?>) val));
    } else {
        results.add(parseValue(val));
    }
}