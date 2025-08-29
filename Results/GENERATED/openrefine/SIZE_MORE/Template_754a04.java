_fragments.stream()
    .forEach(f -> {
        if (f instanceof StaticFragment) {
            writer.write(((StaticFragment) f).text);
        } else {
            DynamicFragment df = (DynamicFragment) f;
            Object value = df.eval.evaluate(bindings);
            if (value != null && ExpressionUtils.isArrayOrCollection(value)) {
                if (ExpressionUtils.isArray(value)) {
                    Arrays.stream((Object[]) value).forEach(this::writeValue);
                } else {
                    ExpressionUtils.toObjectCollection(value).forEach(this::writeValue);
                }
                return;
            }
            writeValue(value);
        }
    });