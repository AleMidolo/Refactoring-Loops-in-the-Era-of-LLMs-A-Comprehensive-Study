IntStream.range(0, cells.length)
    .forEach(i -> result.setComponent(row.getColumnName(i), String.valueOf(ScriptUtil.evaluate(cells[i], context)));