for (Input input : taskDetails.getInputs()) {
    input.setBuildSpecificChanges(() -> input.getFilesAndHashes().stream().map(entry -> new ChangedCachedPath(ADDED, entry.getSourcePath(), entry)).collect(Collectors.toUnmodifiableList()));
}