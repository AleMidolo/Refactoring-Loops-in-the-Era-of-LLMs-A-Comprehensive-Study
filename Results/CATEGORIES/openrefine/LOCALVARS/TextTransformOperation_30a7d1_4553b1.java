for (int i = 0; i < _repeatCount; i++) {
    ExpressionUtils.bind(bindings, row, rowIndex, _columnName, newCell);
    newValue = ExpressionUtils.wrapStorable(eval.evaluate(bindings));
    if (ExpressionUtils.isError(newValue)) {
        break;
    } else if (ExpressionUtils.sameValue(newCell.value, newValue)) {
        break;
    }
    newCell = new Cell(newValue, newCell.recon);
}