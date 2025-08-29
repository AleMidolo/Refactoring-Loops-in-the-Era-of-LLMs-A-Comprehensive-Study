sqlRow.stream()
    .forEach(val -> {
        JsonNode jsonOb = colOptionsMap.get(val.getColumnName());
        String type = JSONUtilities.getString(jsonOb, "type", null);
        String defaultValue = JSONUtilities.getString(jsonOb, "defaultValue", null);
        boolean allowNullChkBox = JSONUtilities.getBoolean(jsonOb, "defaultValue", true);
        
        if (type == null) {
            type = SqlData.SQL_TYPE_VARCHAR;
        }
        
        if (Stream.of(SqlData.SQL_TYPE_VARCHAR, SqlData.SQL_TYPE_CHAR, SqlData.SQL_TYPE_TEXT)
            .anyMatch(t -> t.equals(type))) {
            if ((val.getText() == null || val.getText().isEmpty())) {
                handleNullField(allowNullChkBox, defaultValue, nullValueNull, val.getColumnName(), rowValue, true);
            } else {
                rowValue.append("'" + val.getText().replace("'", "''") + "'");
            }
        } else if (Stream.of(SqlData.SQL_TYPE_INT, SqlData.SQL_TYPE_INTEGER, SqlData.SQL_TYPE_NUMERIC)
            .anyMatch(t -> t.equals(type))) {
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
        } else if (Stream.of(SqlData.SQL_TYPE_DATE, SqlData.SQL_TYPE_TIMESTAMP)
            .anyMatch(t -> t.equals(type))) {
            if ((val.getText() == null || val.getText().isEmpty())) {
                handleNullField(allowNullChkBox, defaultValue, nullValueNull, val.getColumnName(), rowValue, true);
            } else {
                rowValue.append("'" + val.getText() + "'");
            }
        }
        rowValue.append(",");
    });