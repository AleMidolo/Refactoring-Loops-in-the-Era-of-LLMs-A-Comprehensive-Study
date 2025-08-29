for (Value value : itemList) {
    if (propertyIdValueValueMap.get(conflictingPid).contains(value)) {
        return true;
    }
}