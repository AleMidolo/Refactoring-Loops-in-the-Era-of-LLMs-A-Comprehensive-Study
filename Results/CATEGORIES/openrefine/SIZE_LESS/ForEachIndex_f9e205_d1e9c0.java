for (int i = 0; i < list.size(); i++) {
    Object v = list.get(i);
    bindings.put(indexName, i);
    bindings.put(elementName, v);
    Object r = args[3].evaluate(bindings);
    results.add(r);
}