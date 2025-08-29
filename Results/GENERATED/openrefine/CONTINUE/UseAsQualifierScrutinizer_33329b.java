qualifiersList.stream()
    .forEach(qualifier -> qualifier.getSnaks().stream()
        .filter(snak -> snak instanceof ValueSnak)
        .forEach(snak -> {
            PropertyIdValue qualifierPid = qualifier.getProperty();
            List<Value> itemList = qualifiersMap.getOrDefault(qualifierPid, new ArrayList<>());
            itemList.add(((ValueSnak) snak).getValue());
            qualifiersMap.put(qualifierPid, itemList);
        })
    );