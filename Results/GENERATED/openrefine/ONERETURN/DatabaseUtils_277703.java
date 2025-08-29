return savedConfigurations.stream()
    .filter(dc -> dc.getConnectionName().equalsIgnoreCase(connectionName.trim()))
    .findFirst()
    .orElse(null);