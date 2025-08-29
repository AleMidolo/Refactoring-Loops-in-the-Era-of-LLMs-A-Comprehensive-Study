e.entities().stream()
    .map(entity -> entity.get(column))
    .filter(Objects::nonNull)
    .forEach(value -> {
        if (value.getClass() == Integer.class) {
            result += (Integer) value;
        } else if (value.getClass() == Double.class) {
            result += (Double) value;
        } else if (value.getClass() == String.class) {
            try {
                result += Integer.parseInt((String) value);
            } catch (NumberFormatException e1) {
                logger.warn("Could not parse {} as integer try to parse as double", value);
                try {
                    result += Double.parseDouble((String) value);
                } catch (NumberFormatException e2) {
                    logger.warn("Could not parse value {}, not a numeric value", value);
                }
            }
        } else {
            throw new IllegalArgumentError(String.format("Entity %s does not have a column with name %s or given column is not a numeric value", type, column));
        }
    });