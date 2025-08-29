IntStream.range(0, repeatCount)
    .takeWhile(r -> ExpressionUtils.isStorable(result))
    .forEach(r -> {
        Cell newCell = new Cell((Serializable) result, (cell != null) ? cell.recon : null);
        ExpressionUtils.bind(bindings, row, rowIndex, columnName, newCell);
        Object newResult = eval.evaluate(bindings);
        if (ExpressionUtils.isError(newResult) || ExpressionUtils.sameValue(result, newResult)) {
            return;
        } else {
            result = newResult;
        }
    });