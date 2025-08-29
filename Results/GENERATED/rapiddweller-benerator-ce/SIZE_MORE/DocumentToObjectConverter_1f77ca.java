results.addAll(collection.stream()
    .map(val -> {
        if (val instanceof Document) {
            return convertToArray((Document) val);
        } else if (val instanceof Collection) {
            return convertCollection((Collection<?>) val);
        } else {
            return parseValue(val);
        }
    })
    .collect(Collectors.toList()));