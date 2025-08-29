for (int i = 0; i < l; i++) {
    Object v = JsonValueConverter.convert(a.get(i));
    if (v != null) {
        bindings.put(name, v);
    } else {
        bindings.remove(name);
    }
    Object r = args[2].evaluate(bindings);
    if (r instanceof Boolean && ((Boolean) r).booleanValue()) {
        results.add(v);
    }
}