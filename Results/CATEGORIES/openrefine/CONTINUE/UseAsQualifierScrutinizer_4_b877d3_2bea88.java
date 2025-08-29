for (Snak snak : qualifier.getSnaks()) {
    if (!(snak instanceof ValueSnak)) {
        continue;
    }
    if (qualifiersMap.containsKey(qualifierPid)) {
        itemList = qualifiersMap.get(qualifierPid);
    } else {
        itemList = new ArrayList<>();
    }
    itemList.add(((ValueSnak) snak).getValue());
    qualifiersMap.put(qualifierPid, itemList);
}