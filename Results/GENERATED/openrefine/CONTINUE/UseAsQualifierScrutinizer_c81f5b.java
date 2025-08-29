qualifiersList.stream()
    .forEach(qualifier -> {
        PropertyIdValue qualifierPid = qualifier.getProperty();
        qualifier.getSnaks().stream()
            .filter(snak -> snak instanceof ValueSnak)
            .forEach(snak -> {
                List<Value> itemList = qualifiersMap.containsKey(qualifierPid) ? qualifiersMap.get(qualifierPid) : new ArrayList<>();
                itemList.add(((ValueSnak) snak).getValue());
                qualifiersMap.put(qualifierPid, itemList);
            });
    });