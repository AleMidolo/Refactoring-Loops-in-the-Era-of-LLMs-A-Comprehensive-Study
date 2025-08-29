IntStream.range(0, list.size())
    .forEach(i -> {
        Object v = list.get(i);
        bindings.put(indexName, i);
        bindings.put(elementName, v);
        Object r = args[3].evaluate(bindings);
        results.add(r);
    });