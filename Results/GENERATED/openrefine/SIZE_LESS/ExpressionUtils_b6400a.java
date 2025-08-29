s_binders.stream()
        .forEach(binder -> binder.bind(bindings, row, rowIndex, columnName, cell));