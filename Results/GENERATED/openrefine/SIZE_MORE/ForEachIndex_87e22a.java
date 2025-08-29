IntStream.range(0, values.length)
        .forEach(i -> {
            Object v = values[i];
            bindings.put(indexName, i);
            if (v != null) {
                bindings.put(elementName, v);
            } else {
                bindings.remove(elementName);
            }
            Object r = args[3].evaluate(bindings);
            results.add(r);
        });