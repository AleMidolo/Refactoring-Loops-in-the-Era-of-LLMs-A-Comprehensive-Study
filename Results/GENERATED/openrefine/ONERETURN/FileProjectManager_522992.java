Arrays.stream(new String[] { WORKSPACE_JSON, WORKSPACE_TEMP_JSON, WORKSPACE_OLD_JSON })
    .anyMatch(filename -> loadFromFile(new File(_workspaceDir, filename)));