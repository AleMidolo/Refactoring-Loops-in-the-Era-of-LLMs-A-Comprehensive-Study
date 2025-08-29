for (final JsonNode n : netblock) {
    if (isBadCidr || isSgInWhoisNetblock(sgSubnet, n)) {
        String startAddress = n.requiredAt("/startAddress/$").textValue();
        String cidrLength = n.requiredAt("/cidrLength/$").textValue();
        return Optional.of(new EC2SecurityGroup.OwnerCIDR(cidr, ownername, startAddress + "/" + cidrLength, isBadCidr));
    }
}