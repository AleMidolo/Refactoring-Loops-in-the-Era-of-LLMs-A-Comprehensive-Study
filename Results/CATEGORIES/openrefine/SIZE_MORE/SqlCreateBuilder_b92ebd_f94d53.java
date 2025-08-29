for (int i = 0; i < count; i++) {
    JsonNode columnOptions = columnOptionArray.get(i);
    if (columnOptions != null) {
        String name = JSONUtilities.getString(columnOptions, "name", null);
        String type = JSONUtilities.getString(columnOptions, "type", SqlData.SQL_TYPE_VARCHAR);
        String size = JSONUtilities.getString(columnOptions, "size", "");
        boolean allowNull = JSONUtilities.getBoolean(columnOptions, "allowNull", true);
        String defaultValue = JSONUtilities.getString(columnOptions, "defaultValue", null);
        logger.debug("allowNull::{}", allowNull);
        String allowNullStr = "NULL";
        if (!allowNull) {
            allowNullStr = "NOT NULL";
        }
        if (name != null) {
            if (trimColNames) {
                String trimmedCol = name.replaceAll("[^a-zA-Z0-9_]", "_");
                createSB.append(addQuotes(trimmedCol) + " ");
            } else {
                createSB.append(addQuotes(name) + " ");
            }
            if (type.equals(SqlData.SQL_TYPE_VARCHAR)) {
                if (size.isEmpty()) {
                    size = "255";
                }
                createSB.append(type + "(" + size + ")");
            } else if (type.equals(SqlData.SQL_TYPE_CHAR)) {
                if (size.isEmpty()) {
                    size = "10";
                }
                createSB.append(type + "(" + size + ")");
            } else if (type.equals(SqlData.SQL_TYPE_INT) || type.equals(SqlData.SQL_TYPE_INTEGER)) {
                if (size.isEmpty()) {
                    createSB.append(type);
                } else {
                    createSB.append(type + "(" + size + ")");
                }
            } else if (type.equals(SqlData.SQL_TYPE_NUMERIC)) {
                if (size.isEmpty()) {
                    createSB.append(type);
                } else {
                    createSB.append(type + "(" + size + ")");
                }
            } else {
                createSB.append(type);
            }
            createSB.append(" " + allowNullStr);
            if (defaultValue != null && !defaultValue.isEmpty()) {
                if (type.equals(SqlData.SQL_TYPE_VARCHAR) || type.equals(SqlData.SQL_TYPE_CHAR) || type.equals(SqlData.SQL_TYPE_TEXT)) {
                    createSB.append(" DEFAULT " + "'" + defaultValue + "'");
                } else {
                    try {
                        Integer.parseInt(defaultValue);
                    } catch (NumberFormatException nfe) {
                        throw new SqlExporterException(defaultValue + " is not compatible with column type :" + type);
                    }
                    createSB.append(" DEFAULT " + defaultValue);
                }
            }
            if (i < count - 1) {
                createSB.append(",");
            }
            createSB.append("\n");
        }
    }
}