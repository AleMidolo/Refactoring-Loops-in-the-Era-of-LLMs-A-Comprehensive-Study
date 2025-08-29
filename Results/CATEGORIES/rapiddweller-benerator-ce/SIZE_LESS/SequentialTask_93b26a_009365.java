for (Task subTask : subTasks) {
    TaskResult subResult = runSubTask(subTask, context, errorHandler);
    if (subResult != TaskResult.EXECUTING) {
        result = subResult;
    }
}