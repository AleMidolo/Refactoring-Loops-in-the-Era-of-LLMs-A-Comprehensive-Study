IntStream.range(0, _repeatCount)
    .forEach(i -> {
        ExpressionUtils.bind(bindings, row, rowIndex, _columnName, newCell);
        newValue = ExpressionUtils.wrapStorable(eval.evaluate(bindings));
        if (ExpressionUtils.isError(newValue) || ExpressionUtils.sameValue(newCell.value, newValue)) {
            return;
        }
        newCell = new Cell(newValue, newCell.recon);
    });