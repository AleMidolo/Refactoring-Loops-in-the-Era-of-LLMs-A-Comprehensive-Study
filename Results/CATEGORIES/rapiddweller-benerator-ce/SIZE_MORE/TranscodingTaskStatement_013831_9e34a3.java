for (Entry<String, Boolean> req : tableNkRequirements.entrySet()) {
    String tableName = req.getKey();
    Boolean required = req.getValue();
    IdentityModel identity = identityProvider.getIdentity(tableName, false);
    if (identity == null) {
        if (required != null && required) {
            throw ExceptionFactory.getInstance().configurationError("For transcoding, an identity definition of table '" + tableName + "' is required");
        } else {
            DBTable table = target.getDbMetaData().getTable(tableName);
            identity = new NoIdentity(table.getName());
            identityProvider.registerIdentity(identity, tableName);
        }
    }
}