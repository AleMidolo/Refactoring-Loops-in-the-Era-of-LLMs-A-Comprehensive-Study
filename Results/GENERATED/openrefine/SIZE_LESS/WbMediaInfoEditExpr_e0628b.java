getNameDescs()
        .stream()
        .forEach(expr -> expr.contributeTo(update, ctxt));