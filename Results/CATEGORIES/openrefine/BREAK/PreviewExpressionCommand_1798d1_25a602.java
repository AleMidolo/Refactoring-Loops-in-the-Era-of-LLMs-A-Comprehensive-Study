for (int i = 0; i < length; i++) {
    Object result = null;
    int rowIndex = rowIndices.get(i);
    if (rowIndex >= 0 && rowIndex < project.rows.size()) {
        Row row = project.rows.get(rowIndex);
        Cell cell = row.getCell(cellIndex);
        try {
            ExpressionUtils.bind(bindings, row, rowIndex, columnName, cell);
            result = eval.evaluate(bindings);
            if (repeat) {
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
            }
        } catch (Exception e) {
        }
    }
    if (result == null) {
        evaluated.add(null);
    } else if (ExpressionUtils.isError(result)) {
        evaluated.add(new ErrorMessage(((EvalError) result).message));
    } else {
        StringBuffer sb = new StringBuffer();
        writeValue(sb, result, false);
        evaluated.add(new SuccessfulEvaluation(sb.toString()));
    }
}