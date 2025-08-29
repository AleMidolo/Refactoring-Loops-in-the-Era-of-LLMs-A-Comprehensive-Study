ipRangesNode.stream()
        .map(node -> (ObjectNode) node)
        .map(node -> mapper.valueToTree(node.get("cidrIp")))
        .collect(Collectors.toList());