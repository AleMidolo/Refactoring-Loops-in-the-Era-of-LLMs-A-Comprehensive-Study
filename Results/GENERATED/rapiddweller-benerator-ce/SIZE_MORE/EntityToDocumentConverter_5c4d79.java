entity.getComponents().entrySet().stream()
    .forEach(entry -> {
        Object value = entry.getValue();
        if (value instanceof Entity) {
            Entity subEntity = (Entity) entry.getValue();
            if (subEntity.get("$numberLong") != null) {
                value = Long.parseLong((String) subEntity.get("$numberLong"));
            } else if (subEntity.get("$numberInt") != null) {
                value = Integer.parseInt((String) subEntity.get("$numberInt"));
            } else if (subEntity.get("$numberDecimal") != null) {
                value = Decimal128.parse((String) subEntity.get("$numberDecimal"));
            } else if (subEntity.get("$date") != null) {
                value = new Date(Long.parseLong((String) subEntity.get("$date")) * 1000);
            } else {
                value = convert((Entity) value);
            }
        } else if (value instanceof List)
            value = convertList((List<?>) value);
        else if (value instanceof Set)
            value = convertSet((Set<?>) value);
        else if (value != null && value.getClass().isArray())
            value = convertArray(value);
        document.put(entry.getKey(), value);
    });