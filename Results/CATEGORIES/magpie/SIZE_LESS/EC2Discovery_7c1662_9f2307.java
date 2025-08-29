for (int j = 0; j < ipRangesNode.size(); j++) {
    var child = (ObjectNode) ipRangesNode.get(j);
    ipRangesNode.set(j, mapper.valueToTree(child.get("cidrIp")));
}