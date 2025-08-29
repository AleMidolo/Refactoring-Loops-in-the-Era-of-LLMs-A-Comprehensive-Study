result = set.stream()
            .map(n -> new ExecutionMode(true, n))
            .toArray(ExecutionMode[]::new);