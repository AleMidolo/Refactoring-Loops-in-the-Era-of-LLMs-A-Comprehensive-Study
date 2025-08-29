for (DatabaseConfiguration dc : savedConfigurations) {
    if (dc.getConnectionName().equalsIgnoreCase(connectionName.trim())) {
        return dc;
    }
}