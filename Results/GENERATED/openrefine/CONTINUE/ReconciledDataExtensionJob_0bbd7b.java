columns.stream()
    .forEach(ci -> {
        String pid = ci.id;
        ArrayNode values = JSONUtilities.getArray(record, pid);
        if (values == null) {
            return;
        }
        IntStream.range(0, values.size())
            .filter(rowindex -> values.get(rowindex) instanceof ObjectNode)
            .forEach(rowindex -> {
                ObjectNode val = (ObjectNode) values.get(rowindex);

                if (val.has("id")) {
                    storeCell(rows, rowindex, colindex, val, reconCandidateMap);
                } else if (val.has("str")) {
                    String str = val.get("str").asText();
                    storeCell(rows, rowindex, colindex, str);
                } else if (val.has("float")) {
                    double v = val.get("float").asDouble();
                    storeCell(rows, rowindex, colindex, v);
                } else if (val.has("int")) {
                    int v = val.get("int").asInt();
                    storeCell(rows, rowindex, colindex, v);
                } else if (val.has("date")) {
                    Object date;
                    try {
                        date = OffsetDateTime.parse(val.get("date").asText());
                    } catch (DateTimeParseException e) {
                        date = val.get("date").asText();
                    }
                    storeCell(rows, rowindex, colindex, date);
                } else if (val.has("bool")) {
                    boolean v = val.get("bool").asBoolean();
                    storeCell(rows, rowindex, colindex, v);
                }
            });
        colindex++;
    });