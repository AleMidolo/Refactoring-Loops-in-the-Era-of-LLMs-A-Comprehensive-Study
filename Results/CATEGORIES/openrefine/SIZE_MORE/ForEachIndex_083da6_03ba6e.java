for (int i = 0; i < l; i++) {
    Object v = JsonValueConverter.convert(a.get(i));
    bindings.put(indexName, i);
    if (v != null) {
        bindings.put(elementName, v);
    } else {
        bindings.remove(elementName);
    }
    Object r = args[3].evaluate(bindings);
    results.add(r);
}