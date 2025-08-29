candidate.types.stream()
    .filter(typeID -> this.typeID.equals(typeID))
    .findFirst()
    .ifPresent(type -> recon.setFeature(Recon.Feature_typeMatch, true));