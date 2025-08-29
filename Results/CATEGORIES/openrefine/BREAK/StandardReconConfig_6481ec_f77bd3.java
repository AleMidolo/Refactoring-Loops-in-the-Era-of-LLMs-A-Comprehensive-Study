for (String typeID : candidate.types) {
    if (this.typeID.equals(typeID)) {
        recon.setFeature(Recon.Feature_typeMatch, true);
        break;
    }
}