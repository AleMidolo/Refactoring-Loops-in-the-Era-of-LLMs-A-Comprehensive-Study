for (int r = 0; r < repeatCount && ExpressionUtils.isStorable(result); r++) {
    Cell newCell = new Cell((Serializable) result, (cell != null) ? cell.recon : null);
    ExpressionUtils.bind(bindings, row, rowIndex, columnName, newCell);
    Object newResult = eval.evaluate(bindings);
    if (ExpressionUtils.isError(newResult)) {
        break;
    } else if (ExpressionUtils.sameValue(result, newResult)) {
        break;
    } else {
        result = newResult;
    }
}