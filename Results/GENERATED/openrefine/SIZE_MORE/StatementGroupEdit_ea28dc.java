statementEdits.forEach(edit -> {
    StatementMerger merger = edit.getMerger();
    edit.getMode().process(statements.stream()
        .filter(statement -> merger.match(statement, edit.getStatement()))
        .collect(Collectors.toList()), edit, builder);
});