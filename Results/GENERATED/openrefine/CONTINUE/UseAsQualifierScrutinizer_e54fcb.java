qualifier.getSnaks().stream()
    .filter(snak -> snak instanceof ValueSnak)
    .forEach(snak -> {
        if (qualifiersMap.containsKey(qualifierPid)) {
            itemList = qualifiersMap.get(qualifierPid);
        } else {
            itemList = new ArrayList<>();
        }
        itemList.add(((ValueSnak) snak).getValue());
        qualifiersMap.put(qualifierPid, itemList);
    });