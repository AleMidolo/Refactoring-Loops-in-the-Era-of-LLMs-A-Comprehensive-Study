for (int i = 0; i < refererColumnNames.length; i++) {
    if (selector.length() > 0) {
        selector.append(" and ");
    }
    Object refererColumnValue = fromEntity.get(refererColumnNames[i]);
    selector.append(refereeColumnNames[i]).append('=').append(db.getDialect().formatValue(refererColumnValue));
}