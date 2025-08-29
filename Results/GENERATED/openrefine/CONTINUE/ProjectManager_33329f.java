jsonObjArray.stream()
    .filter(jsonObj -> jsonObj instanceof ObjectNode)
    .map(jsonObj -> (ObjectNode) jsonObj)
    .filter(node -> node.get("name").asText("").equals(placeHolderJsonObj.get("name").asText("")))
    .findFirst()
    .ifPresent(node -> {
        found = true;
        node.set("display", placeHolderJsonObj.get("display"));
    });