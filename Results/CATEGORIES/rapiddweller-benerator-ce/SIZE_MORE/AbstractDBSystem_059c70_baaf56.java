for (int i = 0; i < writeColumnInfos.size(); i++) {
    ColumnInfo info = writeColumnInfos.get(i);
    Object jdbcValue = entity.getComponent(info.name);
    if (info.type != null) {
        jdbcValue = AnyConverter.convert(jdbcValue, info.type);
    }
    handleOracleType(tableName, statement, i, info, jdbcValue);
}