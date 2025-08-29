writeColumnInfos.stream()
    .map(info -> {
        Object jdbcValue = entity.getComponent(info.name);
        if (info.type != null) {
            jdbcValue = AnyConverter.convert(jdbcValue, info.type);
        }
        return new AbstractMap.SimpleEntry<>(info, jdbcValue);
    })
    .forEach(entry -> handleOracleType(tableName, statement, writeColumnInfos.indexOf(entry.getKey()), entry.getKey(), entry.getValue()););