ipPermissionsEgressNode.forEach(node -> {
    ObjectNode objNode = (ObjectNode) node;
    ArrayNode ipRangesNode = (ArrayNode) objNode.withArray("ipRanges");
    IntStream.range(0, ipRangesNode.size())
        .forEach(j -> ipRangesNode.set(j, mapper.valueToTree(ipRangesNode.get(j).get("cidrIp"))));
});