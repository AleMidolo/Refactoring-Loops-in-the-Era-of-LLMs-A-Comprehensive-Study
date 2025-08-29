subTasks.stream()
        .map(subTask -> runSubTask(subTask, context, errorHandler))
        .filter(subResult -> subResult != TaskResult.EXECUTING)
        .forEach(subResult -> result = subResult);