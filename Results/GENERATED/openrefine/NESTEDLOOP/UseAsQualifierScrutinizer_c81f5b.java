qualifiersList.stream()
    .forEach(qualifier -> qualifier.getSnaks().stream()
        .filter(snak -> snak instanceof ValueSnak)
        .map(snak -> (ValueSnak) snak)
        .forEach(snak -> {
            PropertyIdValue qualifierPid = qualifier.getProperty();
            List<Value> itemList = qualifiersMap.containsKey(qualifierPid) ? qualifiersMap.get(qualifierPid) : new ArrayList<>();
            itemList.add(snak.getValue());
            qualifiersMap.put(qualifierPid, itemList);
        })
    );