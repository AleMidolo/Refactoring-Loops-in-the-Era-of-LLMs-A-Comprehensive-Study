IntStream.iterate(0, i -> invocationCount == null || i < invocationCount, i -> i + 1)
    .mapToObj(i -> target.execute(context, errorHandler))
    .takeWhile(stepResult -> stepResult == TaskResult.EXECUTING)
    .filter(stepResult -> stepResult != TaskResult.UNAVAILABLE)
    .forEach(stepResult -> actualCount++);