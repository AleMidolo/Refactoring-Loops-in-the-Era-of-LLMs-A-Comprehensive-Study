((LabeledStatementEntityEdit) update).getLabelsIfNew().stream()
    .forEach(this::scrutinize);