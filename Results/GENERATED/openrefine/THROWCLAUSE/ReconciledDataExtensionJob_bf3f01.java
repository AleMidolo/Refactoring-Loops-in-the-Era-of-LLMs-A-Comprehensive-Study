values.stream()
    .filter(value -> value instanceof ObjectNode)
    .forEach(value -> {
        ObjectNode val = (ObjectNode) value;
        
        if (val.has("id")) {
            storeCell(rows, values.indexOf(value), colindex, val, reconCandidateMap);
        } else if (val.has("str")) {
            storeCell(rows, values.indexOf(value), colindex, val.get("str").asText());
        } else if (val.has("float")) {
            storeCell(rows, values.indexOf(value), colindex, val.get("float").asDouble());
        } else if (val.has("int")) {
            storeCell(rows, values.indexOf(value), colindex, val.get("int").asInt());
        } else if (val.has("date")) {
            Object date;
            try {
                date = OffsetDateTime.parse(val.get("date").asText());
            } catch (DateTimeParseException e) {
                date = val.get("date").asText();
            }
            storeCell(rows, values.indexOf(value), colindex, date);
        } else if (val.has("bool")) {
            storeCell(rows, values.indexOf(value), colindex, val.get("bool").asBoolean());
        }
    });