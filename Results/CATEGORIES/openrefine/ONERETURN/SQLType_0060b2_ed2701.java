for (SQLType sqlType : jdbcDriverRegistry.values()) {
    if (sqlType.getIdentifier().equalsIgnoreCase(name)) {
        return sqlType;
    }
}