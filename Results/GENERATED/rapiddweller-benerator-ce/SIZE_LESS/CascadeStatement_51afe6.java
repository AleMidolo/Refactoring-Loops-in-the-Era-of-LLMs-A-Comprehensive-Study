IntStream.range(0, refererColumnNames.length)
        .filter(i -> selector.length() > 0)
        .forEach(i -> {
            Object refererColumnValue = fromEntity.get(refererColumnNames[i]);
            selector.append(refereeColumnNames[i]).append('=').append(db.getDialect().formatValue(refererColumnValue));
        });