for (Object v : collection) {
    if (v != null) {
        bindings.put(name, v);
    } else {
        bindings.remove(name);
    }
    Object r = args[2].evaluate(bindings);
    results.add(r);
}