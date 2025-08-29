inputSources.getChanges().forEach(change -> {
    unmodified.remove(change.getSourcePath());
    if (change.changeType() != ChangedCachedPath.ChangeType.REMOVED) {
        filesToProcess.add(makeFileInfo(change));
    }
});