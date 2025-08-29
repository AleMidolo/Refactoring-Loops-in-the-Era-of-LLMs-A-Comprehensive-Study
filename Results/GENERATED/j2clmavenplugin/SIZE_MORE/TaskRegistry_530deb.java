loader.stream()
    .filter(task -> task.getTaskName().equals(outputToNameMappings.get(task.getOutputType()) != null ?  outputToNameMappings.get(task.getOutputType()) : "default"))
    .forEach(task -> outputTypeToTaskMappings.put(task.getOutputType(), task));