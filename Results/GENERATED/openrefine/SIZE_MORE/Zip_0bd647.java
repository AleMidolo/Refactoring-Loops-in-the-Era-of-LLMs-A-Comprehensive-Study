args.stream()
        .filter(v -> v == null || !(v.getClass().isArray() || v instanceof List<?> || v instanceof ArrayNode))
        .findFirst()
        .map(v -> new EvalError(EvalErrorMessage.expects_at_least_two_or_more_array_args(ControlFunctionRegistry.getFunctionName(this)))
        .orElseGet(() -> {
            args.stream()
               .forEach(v -> {
                   if (v.getClass().isArray()) {
                       iterators.add(Arrays.stream((Object[]) v).spliterator());
                   } else if (v instanceof ArrayNode) {
                       iterators.add(((ArrayNode) v).spliterator());
                   } else {
                       iterators.add(((List<Object>) v).spliterator());
                   }
               });
            return null;
        });