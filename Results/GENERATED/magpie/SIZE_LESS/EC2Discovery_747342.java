Optional.of(netblock.stream()
    .filter(n -> isBadCidr || isSgInWhoisNetblock(sgSubnet, n))
    .map(n -> new EC2SecurityGroup.OwnerCIDR(cidr, ownername, n.requiredAt("/startAddress/$").textValue() + "/" + n.requiredAt("/cidrLength/$").textValue(), isBadCidr))
    .findFirst());