for (Fragment f : _fragments) {
    if (f instanceof StaticFragment) {
        writer.write(((StaticFragment) f).text);
    } else {
        DynamicFragment df = (DynamicFragment) f;
        Object value = df.eval.evaluate(bindings);
        if (value != null && ExpressionUtils.isArrayOrCollection(value)) {
            if (ExpressionUtils.isArray(value)) {
                Object[] a = (Object[]) value;
                for (Object v : a) {
                    writeValue(v);
                }
            } else {
                Collection<Object> a = ExpressionUtils.toObjectCollection(value);
                for (Object v : a) {
                    writeValue(v);
                }
            }
            continue;
        }
        writeValue(value);
    }
}