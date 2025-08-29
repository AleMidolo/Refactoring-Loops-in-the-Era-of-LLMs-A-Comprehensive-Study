Arrays.stream(new String[] { WORKSPACE_JSON, WORKSPACE_TEMP_JSON, WORKSPACE_OLD_JSON })
    .map(filename -> new File(_workspaceDir, filename))
    .filter(this::loadFromFile)
    .findFirst()
    .ifPresent(file -> { return; });