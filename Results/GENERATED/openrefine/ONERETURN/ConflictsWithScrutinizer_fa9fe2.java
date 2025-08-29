return itemList.stream()
    .anyMatch(value -> propertyIdValueValueMap.get(conflictingPid).contains(value));