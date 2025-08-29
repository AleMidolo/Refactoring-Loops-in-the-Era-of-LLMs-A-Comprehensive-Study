for (Map.Entry<ComplexTypeDescriptor, PreparedStatement> entry : statements.entrySet()) {
    PreparedStatement statement = entry.getValue();
    if (statement != null) {
        if (db.isBatch()) {
            statement.executeBatch();
        }
        jdbcLogger.debug("Closing statement: {}", statement);
        DBUtil.close(statement);
    }
    entry.setValue(null);
}