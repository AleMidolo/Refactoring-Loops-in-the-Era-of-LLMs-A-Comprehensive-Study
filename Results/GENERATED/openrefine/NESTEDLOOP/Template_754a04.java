_fragments.stream()
        .forEach(f -> {
            if (f instanceof StaticFragment) {
                writer.write(((StaticFragment) f).text);
            } else {
                DynamicFragment df = (DynamicFragment) f;
                Object value = df.eval.evaluate(bindings);
                if (value != null && ExpressionUtils.isArrayOrCollection(value)) {
                    if (ExpressionUtils.isArray(value)) {
                        Object[] a = (Object[]) value;
                        Arrays.stream(a).forEach(this::writeValue);
                    } else {
                        Collection<Object> a = ExpressionUtils.toObjectCollection(value);
                        a.stream().forEach(this::writeValue);
                    }
                    return;
                }
                writeValue(value);
            }
        });