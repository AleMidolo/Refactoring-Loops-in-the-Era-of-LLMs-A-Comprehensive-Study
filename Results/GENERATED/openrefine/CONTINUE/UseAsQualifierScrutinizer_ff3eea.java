qualifier.getSnaks().stream()
    .filter(snak -> snak instanceof ValueSnak)
    .forEach(snak -> {
        List<Value> itemList = qualifiersMap.getOrDefault(qualifierPid, new ArrayList<>());
        itemList.add(((ValueSnak) snak).getValue());
        qualifiersMap.put(qualifierPid, itemList);
    });