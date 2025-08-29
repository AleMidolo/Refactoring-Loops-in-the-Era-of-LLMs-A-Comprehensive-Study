for (Entity entity : entities) {
    Object partValue = entity.get(partName);
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
    counter.count(partCount);
}