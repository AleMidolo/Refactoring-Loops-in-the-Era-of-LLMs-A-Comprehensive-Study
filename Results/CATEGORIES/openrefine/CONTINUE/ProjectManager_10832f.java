for (int i = 0; i < jsonObjArray.size(); i++) {
    JsonNode jsonObj = jsonObjArray.get(i);
    if (!(jsonObj instanceof ObjectNode)) {
        continue;
    }
    ObjectNode node = (ObjectNode) jsonObj;
    if (node.get("name").asText("").equals(placeHolderJsonObj.get("name").asText(""))) {
        found = true;
        node.set("display", placeHolderJsonObj.get("display"));
        break;
    }
}