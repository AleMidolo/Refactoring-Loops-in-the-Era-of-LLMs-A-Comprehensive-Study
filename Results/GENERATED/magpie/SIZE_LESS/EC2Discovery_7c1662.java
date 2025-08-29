ipRangesNode = IntStream.range(0, ipRangesNode.size())
    .mapToObj(j -> (ObjectNode) ipRangesNode.get(j))
    .map(child -> mapper.valueToTree(child.get("cidrIp")))
    .collect(Collectors.toList());