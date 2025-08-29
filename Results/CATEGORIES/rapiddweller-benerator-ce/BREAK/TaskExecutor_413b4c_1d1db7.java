for (int i = 0; invocationCount == null || i < invocationCount; i++) {
    TaskResult stepResult = target.execute(context, errorHandler);
    if (stepResult != TaskResult.UNAVAILABLE) {
        actualCount++;
    }
    if (stepResult != TaskResult.EXECUTING) {
        break;
    }
}