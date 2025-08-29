jsonObjArray.stream()
    .filter(obj -> obj instanceof ObjectNode)
    .map(obj -> (ObjectNode) obj)
    .forEach(obj -> obj.put("display", false));