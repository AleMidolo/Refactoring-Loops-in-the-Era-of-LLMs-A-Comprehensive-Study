claim.getQualifiers().stream()
    .forEach(q -> translateSnakGroup(q, false, writer));