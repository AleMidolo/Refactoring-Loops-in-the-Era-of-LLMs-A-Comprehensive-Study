IntStream.range(0, refererColumnNames.length)
    .filter(i -> selector.length() > 0)
    .forEach(i -> {
        if (selector.length() > 0) {
            selector.append(" and ");
        }
        Object refereeColumnValue = fromEntity.get(refereeColumnNames[i]);
        selector.append(refererColumnNames[i]).append('=').append(db.getDialect().formatValue(refereeColumnValue));
    });