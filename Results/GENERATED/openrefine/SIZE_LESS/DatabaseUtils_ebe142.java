savedConnections.stream()
    .map(d -> {
        d.setDatabasePassword(decrypt(d.getDatabasePassword()));
        return d;
    })
    .forEach(dbConfigs::add);