Arrays.stream(params)
    .forEach(i -> parameterizedAccessorStatement.setObject(i + 1, params[i]));