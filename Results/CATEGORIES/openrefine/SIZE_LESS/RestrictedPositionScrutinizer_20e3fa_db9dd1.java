for (Reference ref : statement.getReferences()) {
    scrutinizeSnakSet(ref.getAllSnaks(), entityId, SnakPosition.REFERENCE, added);
}