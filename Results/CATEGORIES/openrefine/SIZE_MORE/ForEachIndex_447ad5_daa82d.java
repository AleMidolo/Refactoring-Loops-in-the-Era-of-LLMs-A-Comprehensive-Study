for (Iterator<Map.Entry<String, JsonNode>> it = obj.fields(); it.hasNext(); ) {
    Map.Entry<String, JsonNode> entry = it.next();
    if (entry != null) {
        bindings.put(indexName, entry.getKey());
        bindings.put(elementName, entry.getValue());
    } else {
        bindings.remove(indexName);
        bindings.remove(elementName);
    }
    Object r = args[3].evaluate(bindings);
    results.add(r);
}