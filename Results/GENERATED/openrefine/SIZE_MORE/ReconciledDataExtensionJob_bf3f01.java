values.stream()
    .filter(value -> value instanceof ObjectNode)
    .map(value -> (ObjectNode) value)
    .forEach(val -> {
        if (val.has("id")) {
            storeCell(rows, values.indexOf(val), colindex, val, reconCandidateMap);
        } else if (val.has("str")) {
            String str = val.get("str").asText();
            storeCell(rows, values.indexOf(val), colindex, str);
        } else if (val.has("float")) {
            double v = val.get("float").asDouble();
            storeCell(rows, values.indexOf(val), colindex, v);
        } else if (val.has("int")) {
            int v = val.get("int").asInt();
            storeCell(rows, values.indexOf(val), colindex, v);
        } else if (val.has("date")) {
            Object date;
            try {
                date = OffsetDateTime.parse(val.get("date").asText());
            } catch (DateTimeParseException e) {
                date = val.get("date").asText();
            }
            storeCell(rows, values.indexOf(val), colindex, date);
        } else if (val.has("bool")) {
            boolean v = val.get("bool").asBoolean();
            storeCell(rows, values.indexOf(val), colindex, v);
        }
    });