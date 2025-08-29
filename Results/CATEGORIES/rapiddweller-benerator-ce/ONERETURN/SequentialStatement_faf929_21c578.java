for (Statement subStatement : subStatements) {
    if (!subStatement.execute(context)) {
        return false;
    }
}