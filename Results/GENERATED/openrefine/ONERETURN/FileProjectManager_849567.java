Arrays.asList(WORKSPACE_JSON, WORKSPACE_TEMP_JSON, WORKSPACE_OLD_JSON)
    .stream()
    .map(filename -> new File(_workspaceDir, filename))
    .filter(this::loadFromFile)
    .findFirst()
    .ifPresent(f -> { return; });