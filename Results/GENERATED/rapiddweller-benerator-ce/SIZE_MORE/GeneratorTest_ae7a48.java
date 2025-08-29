entities.stream()
    .map(entity -> entity.get(partName))
    .map(partValue -> {
        int partCount;
        if (partValue == null) {
            partCount = 0;
        } else if (partValue instanceof Collection) {
            partCount = ((Collection) partValue).size();
        } else if (partValue.getClass().isArray()) {
            partCount = Array.getLength(partValue);
        } else {
            partCount = 1;
        }
        return partCount;
    })
    .forEach(counter::count);