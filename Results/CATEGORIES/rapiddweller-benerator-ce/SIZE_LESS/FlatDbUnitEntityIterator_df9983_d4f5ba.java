for (int i = 0; i < cells.length; i++) {
    String rowValue = String.valueOf(ScriptUtil.evaluate(cells[i], context));
    result.setComponent(row.getColumnName(i), rowValue);
}