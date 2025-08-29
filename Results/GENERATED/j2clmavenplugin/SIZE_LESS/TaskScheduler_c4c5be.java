taskSummaryDiskFormat.getInputs().stream()
    .filter(onDiskInput -> taskDetails.getInputs().stream()
        .noneMatch(currentInput -> currentInput.getProject().getKey().equals(onDiskInput.getProjectKey()) && currentInput.getOutputType().equals(onDiskInput.getOutputType())))
    .forEach(onDiskInput -> latestResult = Optional.empty());