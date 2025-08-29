subStatements.stream()
        .allMatch(subStatement -> subStatement.execute(context));