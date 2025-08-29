for (SqlData val : sqlRow) {
    JsonNode jsonOb = colOptionsMap.get(val.getColumnName());
    String type = JSONUtilities.getString(jsonOb, "type", null);
    String defaultValue = JSONUtilities.getString(jsonOb, "defaultValue", null);
    boolean allowNullChkBox = JSONUtilities.getBoolean(jsonOb, "defaultValue", true);
    ;
    if (type == null) {
        type = SqlData.SQL_TYPE_VARCHAR;
    }
    if (type.equals(SqlData.SQL_TYPE_VARCHAR) || type.equals(SqlData.SQL_TYPE_CHAR) || type.equals(SqlData.SQL_TYPE_TEXT)) {
        if ((val.getText() == null || val.getText().isEmpty())) {
            handleNullField(allowNullChkBox, defaultValue, nullValueNull, val.getColumnName(), rowValue, true);
        } else {
            rowValue.append("'" + val.getText().replace("'", "''") + "'");
        }
    } else if (type.equals(SqlData.SQL_TYPE_INT) || type.equals(SqlData.SQL_TYPE_INTEGER) || type.equals(SqlData.SQL_TYPE_NUMERIC)) {
        if ((val.getText() == null || val.getText().isEmpty())) {
            handleNullField(allowNullChkBox, defaultValue, nullValueNull, val.getColumnName(), rowValue, false);
        } else {
            if (type.equals(SqlData.SQL_TYPE_NUMERIC)) {
                if (!NumberUtils.isCreatable(val.getText())) {
                    throw new SqlExporterException(val.getText() + " is not compatible with column type :" + type);
                }
            } else {
                try {
                    Integer.parseInt(val.getText());
                } catch (NumberFormatException nfe) {
                    throw new SqlExporterException(val.getText() + " is not compatible with column type :" + type);
                }
            }
            rowValue.append(val.getText());
        }
    } else if (type.equals(SqlData.SQL_TYPE_DATE) || type.equals(SqlData.SQL_TYPE_TIMESTAMP)) {
        if ((val.getText() == null || val.getText().isEmpty())) {
            handleNullField(allowNullChkBox, defaultValue, nullValueNull, val.getColumnName(), rowValue, true);
        } else {
            rowValue.append("'" + val.getText() + "'");
        }
    }
    rowValue.append(",");
}