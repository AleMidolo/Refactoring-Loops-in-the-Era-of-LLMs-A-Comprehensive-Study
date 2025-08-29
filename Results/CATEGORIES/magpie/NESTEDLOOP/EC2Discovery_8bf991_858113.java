for (int i = 0; i < ipPermissionsEgressNode.size(); i++) {
    ObjectNode objNode = (ObjectNode) ipPermissionsEgressNode.get(i);
    ArrayNode ipRangesNode = (ArrayNode) objNode.get("ipRanges");
    for (int j = 0; j < ipRangesNode.size(); j++) {
        var child = (ObjectNode) ipRangesNode.get(j);
        ipRangesNode.set(j, mapper.valueToTree(child.get("cidrIp")));
    }
}