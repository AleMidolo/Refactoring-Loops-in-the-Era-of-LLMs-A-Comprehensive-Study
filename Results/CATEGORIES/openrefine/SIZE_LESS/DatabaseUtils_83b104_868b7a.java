for (DatabaseConfiguration dc : savedConnections) {
    if (!dc.getConnectionName().equalsIgnoreCase(connectionName.trim())) {
        newSavedConns.add(dc);
    }
}