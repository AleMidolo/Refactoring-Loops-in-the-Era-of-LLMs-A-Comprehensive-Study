IntStream.range(0, length)
    .mapToObj(i -> {
        Object result = null;
        int rowIndex = rowIndices.get(i);
        if (rowIndex >= 0 && rowIndex < project.rows.size()) {
            Row row = project.rows.get(rowIndex);
            Cell cell = row.getCell(cellIndex);
            try {
                ExpressionUtils.bind(bindings, row, rowIndex, columnName, cell);
                result = eval.evaluate(bindings);
                if (repeat) {
                    IntStream.range(0, repeatCount)
                        .filter(r -> ExpressionUtils.isStorable(result))
                        .findFirst()
                        .ifPresent(r -> {
                            Cell newCell = new Cell((Serializable) result, (cell != null) ? cell.recon : null);
                            ExpressionUtils.bind(bindings, row, rowIndex, columnName, newCell);
                            Object newResult = eval.evaluate(bindings);
                            if (!ExpressionUtils.isError(newResult) && !ExpressionUtils.sameValue(result, newResult)) {
                                result = newResult;
                            }
                        });
                }
            } catch (Exception e) {
            }
        }
        return result;
    })
    .map(result -> {
        if (result == null) {
            return null;
        } else if (ExpressionUtils.isError(result)) {
            return new ErrorMessage(((EvalError) result).message);
        } else {
            StringBuffer sb = new StringBuffer();
            writeValue(sb, result, false);
            return new SuccessfulEvaluation(sb.toString());
        }
    })
    .forEach(evaluated::add);