savedConnections.stream()
    .filter(dc -> !dc.getConnectionName().equalsIgnoreCase(connectionName.trim()))
    .forEach(newSavedConns::add);