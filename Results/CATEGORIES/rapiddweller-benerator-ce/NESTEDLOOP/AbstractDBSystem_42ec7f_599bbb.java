for (DBCatalog catalog : database.getCatalogs()) {
    for (DBSchema schema : catalog.getSchemas()) {
        DBTable table = schema.getTable(tableName);
        if (table != null) {
            return table;
        }
    }
}