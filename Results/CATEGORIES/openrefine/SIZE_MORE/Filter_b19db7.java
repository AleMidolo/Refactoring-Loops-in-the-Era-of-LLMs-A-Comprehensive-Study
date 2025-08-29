for (Object v : values) {
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