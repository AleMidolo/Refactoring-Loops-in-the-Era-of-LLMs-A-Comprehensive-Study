IntStream.range(0, count)
        .forEach(i -> {
            JsonNode columnOptions = columnOptionArray.get(i);
            if (columnOptions != null) {
                String name = JSONUtilities.getString(columnOptions, "name", null);
                String type = JSONUtilities.getString(columnOptions, "type", SqlData.SQL_TYPE_VARCHAR);
                String size = JSONUtilities.getString(columnOptions, "size", "");
                boolean allowNull = JSONUtilities.getBoolean(columnOptions, "allowNull", true);
                String defaultValue = JSONUtilities.getString(columnOptions, "defaultValue", null);
                logger.debug("allowNull::{}", allowNull);
                String allowNullStr = allowNull ? "NULL" : "NOT NULL";
                if (name != null) {
                    String trimmedCol = trimColNames ? name.replaceAll("[^a-zA-Z0-9_]", "_") : name;
                    createSB.append(addQuotes(trimmedCol) + " ");
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
                        if (!size.isEmpty()) {
                            createSB.append(type + "(" + size + ")");
                        } else {
                            createSB.append(type);
                        }
                    } else if (type.equals(SqlData.SQL_TYPE_NUMERIC)) {
                        if (!size.isEmpty()) {
                            createSB.append(type + "(" + size + ")");
                        } else {
                            createSB.append(type);
                        }
                    } else {
                        createSB.append(type);
                    }
                    createSB.append(" " + allowNullStr);
                    if (defaultValue != null && !defaultValue.isEmpty()) {
                        createSB.append((type.equals(SqlData.SQL_TYPE_VARCHAR) || type.equals(SqlData.SQL_TYPE_CHAR) || type.equals(SqlData.SQL_TYPE_TEXT) ? " DEFAULT '" + defaultValue + "'" : " DEFAULT " + defaultValue));
                    }
                    createSB.append(i < count - 1 ? "," : "")
                            .append("\n");
                }
            }
        });