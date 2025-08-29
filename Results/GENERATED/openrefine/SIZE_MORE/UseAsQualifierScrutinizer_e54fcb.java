qualifier.getSnaks().stream()
    .filter(s -> s instanceof ValueSnak)
    .forEach(s -> {
        ValueSnak snak = (ValueSnak) s;
        if (qualifiersMap.containsKey(qualifierPid)) {
            itemList = qualifiersMap.get(qualifierPid);
        } else {
            itemList = new ArrayList<>();
        }
        itemList.add(snak.getValue());
        qualifiersMap.put(qualifierPid, itemList);
    });