return itemList.stream()
    .noneMatch(value -> propertyIdValueValueMap.get(itemRequiresPid).contains(value));