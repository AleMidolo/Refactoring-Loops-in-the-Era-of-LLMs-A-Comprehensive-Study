for (TaskSummaryDiskFormat.InputDiskFormat onDiskInput : taskSummaryDiskFormat.getInputs()) {
    if (taskDetails.getInputs().stream().noneMatch(currentInput -> currentInput.getProject().getKey().equals(onDiskInput.getProjectKey()) && currentInput.getOutputType().equals(onDiskInput.getOutputType()))) {
        latestResult = Optional.empty();
    }
}