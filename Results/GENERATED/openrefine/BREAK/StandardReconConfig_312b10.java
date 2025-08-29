candidate.types.stream()
    .filter(typeID -> this.typeID.equals(typeID))
    .findFirst()
    .ifPresent(typeID -> recon.setFeature(Recon.Feature_typeMatch, true));