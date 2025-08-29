for (int i = 0; i < _userMetadata.size(); i++) {
    ObjectNode obj = (ObjectNode) _userMetadata.get(i);
    if (obj.get("name").asText("").equals(metaName)) {
        obj.put("value", valueString);
    }
}