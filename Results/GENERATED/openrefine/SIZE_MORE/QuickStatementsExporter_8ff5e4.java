statement.getReferences().forEach(r -> {
    writer.write(qid + mainSnakQS);
    claim.getQualifiers().forEach(q -> translateSnakGroup(q, false, writer));
    r.getSnakGroups().forEach(g -> translateSnakGroup(g, true, writer));
    writer.write("\n");
});