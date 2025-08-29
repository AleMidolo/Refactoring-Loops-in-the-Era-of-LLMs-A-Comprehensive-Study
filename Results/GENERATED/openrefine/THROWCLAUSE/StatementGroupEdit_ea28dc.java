statementEdits.stream()
    .forEach(edit -> {
        StatementMerger merger = edit.getMerger();
        statements.stream()
            .filter(statement -> merger.match(statement, edit.getStatement()))
            .forEach(matchingStatement -> {
                switch (edit.getMode()) {
                    case ADD:
                        if (matchingStatements.findAny().isEmpty()) {
                            builder.add(edit.getStatement());
                        }
                        break;
                    case ADD_OR_MERGE:
                        Optional<Statement> firstMatching = matchingStatements.findFirst();
                        if (firstMatching.isEmpty()) {
                            builder.add(edit.getStatement());
                        } else {
                            builder.replace(merger.merge(firstMatching.get(), edit.getStatement()));
                        }
                        break;
                    case DELETE:
                        builder.remove(matchingStatement.getStatementId());
                        break;
                    default:
                        throw new IllegalStateException("Unsupported statement editing mode " + edit.getMode());
                }
            });
    });