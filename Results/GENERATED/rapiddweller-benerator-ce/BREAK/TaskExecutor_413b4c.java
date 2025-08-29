IntStream.range(0, invocationCount == null ? Integer.MAX_VALUE : invocationCount)
    .mapToObj(i -> target.execute(context, errorHandler))
    .takeWhile(stepResult -> stepResult == TaskResult.EXECUTING || stepResult == TaskResult.UNAVAILABLE)
    .filter(stepResult -> stepResult != TaskResult.UNAVAILABLE)
    .forEach(stepResult -> actualCount++);