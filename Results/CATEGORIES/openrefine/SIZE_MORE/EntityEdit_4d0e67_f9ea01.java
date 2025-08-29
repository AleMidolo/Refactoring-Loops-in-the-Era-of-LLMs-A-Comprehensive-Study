for (EntityEdit update : entityDocuments) {
    if (update.isNull()) {
        continue;
    }
    EntityIdValue qid = update.getEntityId();
    if (map.containsKey(qid)) {
        EntityEdit oldUpdate = map.get(qid);
        map.put(qid, oldUpdate.merge(update));
    } else {
        map.put(qid, update);
    }
}