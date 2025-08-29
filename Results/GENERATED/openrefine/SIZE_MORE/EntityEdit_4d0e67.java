entityDocuments.stream()
        .filter(update -> !update.isNull())
        .forEach(update -> {
            EntityIdValue qid = update.getEntityId();
            map.put(qid, map.containsKey(qid) ? map.get(qid).merge(update) : update);
        });