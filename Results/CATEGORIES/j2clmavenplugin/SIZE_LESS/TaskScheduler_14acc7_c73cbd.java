for (Input input : taskDetails.getInputs()) {
    input.setBuildSpecificChanges(() -> {
        Optional<TaskSummaryDiskFormat.InputDiskFormat> prevInput = taskSummaryDiskFormat.getInputs().stream().filter(i -> i.getProjectKey().equals(input.getProject().getKey())).filter(i -> i.getOutputType().equals(input.getOutputType())).findAny();
        if (prevInput.isPresent()) {
            return diff(input.getFilesAndHashes().stream().collect(Collectors.toMap(e -> e.getSourcePath().toString(), Function.identity())), prevInput.get().getFileHashes());
        }
        return input.getFilesAndHashes().stream().map(entry -> new ChangedCachedPath(ADDED, entry.getSourcePath(), entry)).collect(Collectors.toUnmodifiableList());
    });
}