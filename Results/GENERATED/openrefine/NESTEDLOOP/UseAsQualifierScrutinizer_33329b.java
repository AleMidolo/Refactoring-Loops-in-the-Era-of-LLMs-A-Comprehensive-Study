qualifiersList.stream()
    .forEach(qualifier -> qualifier.getSnaks().stream()
            .filter(snak -> snak instanceof ValueSnak)
            .forEach(snak -> {
                PropertyIdValue qualifierPid = qualifier.getProperty();
                qualifiersMap.computeIfAbsent(qualifierPid, k -> new ArrayList<>())
                        .add(((ValueSnak) snak).getValue());
            })
    );