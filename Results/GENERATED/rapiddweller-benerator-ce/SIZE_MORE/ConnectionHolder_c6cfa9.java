statements.entrySet().stream()
    .map(Map.Entry::getValue)
    .filter(Objects::nonNull)
    .peek(statement -> {
        if (db.isBatch()) {
            statement.executeBatch();
        }
        jdbcLogger.debug("Closing statement: {}", statement);
        DBUtil.close(statement);
    })
    .forEach(statementEntry -> statementEntry.setValue(null));