for (String filename : new String[] { WORKSPACE_JSON, WORKSPACE_TEMP_JSON, WORKSPACE_OLD_JSON }) {
    if (loadFromFile(new File(_workspaceDir, filename))) {
        return;
    }
}