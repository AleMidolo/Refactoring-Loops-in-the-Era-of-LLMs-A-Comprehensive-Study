ipPermissionsEgressNode.stream()
    .map(node -> (ObjectNode) node)
    .map(node -> (ArrayNode) node.get("ipRanges"))
    .forEach(ipRangesNode -> {
        IntStream.range(0, ipRangesNode.size())
            .mapToObj(j -> (ObjectNode) ipRangesNode.get(j))
            .forEach(child -> ipRangesNode.set(ipRangesNode.indexOf(child), mapper.valueToTree(child.get("cidrIp")));
    });