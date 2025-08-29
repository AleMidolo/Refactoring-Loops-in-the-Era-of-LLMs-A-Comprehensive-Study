for (ChangedCachedPath change : inputSources.getChanges()) {
    unmodified.remove(change.getSourcePath());
    if (change.changeType() != ChangedCachedPath.ChangeType.REMOVED) {
        filesToProcess.add(makeFileInfo(change));
    }
}