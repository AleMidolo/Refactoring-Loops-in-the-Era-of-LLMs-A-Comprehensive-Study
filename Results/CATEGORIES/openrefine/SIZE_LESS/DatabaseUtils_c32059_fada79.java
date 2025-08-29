for (DatabaseConfiguration d : savedConnections) {
    d.setDatabasePassword(decrypt(d.getDatabasePassword()));
    dbConfigs.add(d);
}