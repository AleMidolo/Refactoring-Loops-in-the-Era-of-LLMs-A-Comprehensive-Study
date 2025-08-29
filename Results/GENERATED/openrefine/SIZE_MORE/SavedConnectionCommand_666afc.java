IntStream.range(0, size)
    .forEach(i -> {
        writer.writeStartObject();
        DatabaseConfiguration dbConfig = (DatabaseConfiguration) savedConnections.get(i);
        writer.writeStringField("connectionName", dbConfig.getConnectionName());
        writer.writeStringField("databaseType", dbConfig.getDatabaseType());
        writer.writeStringField("databaseHost", dbConfig.getDatabaseHost());
        writer.writeNumberField("databasePort", dbConfig.getDatabasePort());
        writer.writeStringField("databaseName", dbConfig.getDatabaseName());
        String dbPasswd = dbConfig.getDatabasePassword();
        if (dbPasswd != null && !dbPasswd.isEmpty()) {
            dbPasswd = DatabaseUtils.decrypt(dbConfig.getDatabasePassword());
        }
        writer.writeStringField("databasePassword", dbPasswd);
        writer.writeStringField("databaseSchema", dbConfig.getDatabaseSchema());
        writer.writeStringField("databaseUser", dbConfig.getDatabaseUser());
        writer.writeEndObject();
    });