for (int i = 0; i < refererColumnNames.length; i++) {
    if (selector.length() > 0) {
        selector.append(" and ");
    }
    Object refereeColumnValue = fromEntity.get(refereeColumnNames[i]);
    selector.append(refererColumnNames[i]).append('=').append(db.getDialect().formatValue(refereeColumnValue));
}