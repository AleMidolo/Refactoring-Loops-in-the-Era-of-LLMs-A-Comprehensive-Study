for (TaskFactory task : loader) {
    String mapping = outputToNameMappings.get(task.getOutputType());
    if (mapping == null) {
        mapping = "default";
    }
    if (task.getTaskName().equals(mapping)) {
        outputTypeToTaskMappings.put(task.getOutputType(), task);
    }
}