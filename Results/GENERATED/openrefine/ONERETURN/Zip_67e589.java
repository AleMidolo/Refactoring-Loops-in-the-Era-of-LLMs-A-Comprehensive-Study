args.stream()
    .forEach(v -> {
        if (v == null || !(v.getClass().isArray() || v instanceof List<?> || v instanceof ArrayNode)) {
            new EvalError(EvalErrorMessage.expects_at_least_two_or_more_array_args(ControlFunctionRegistry.getFunctionName(this)));
        } else if (v.getClass().isArray()) {
            iterators.add(Arrays.stream((Object[]) v).spliterator());
        } else if (v instanceof ArrayNode) {
            iterators.add(((ArrayNode) v).spliterator());
        } else {
            iterators.add(((List<Object>) v).spliterator());
        }
    });