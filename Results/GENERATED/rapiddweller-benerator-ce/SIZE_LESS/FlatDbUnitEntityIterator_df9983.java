IntStream.range(0, cells.length)
    .forEach(i -> {
        String rowValue = String.valueOf(ScriptUtil.evaluate(cells[i], context));
        result.setComponent(row.getColumnName(i), rowValue);
    });