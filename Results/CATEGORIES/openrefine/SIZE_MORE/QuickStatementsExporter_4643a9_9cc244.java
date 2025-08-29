for (Reference r : statement.getReferences()) {
    writer.write(qid + mainSnakQS);
    for (SnakGroup q : claim.getQualifiers()) {
        translateSnakGroup(q, false, writer);
    }
    for (SnakGroup g : r.getSnakGroups()) {
        translateSnakGroup(g, true, writer);
    }
    writer.write("\n");
}