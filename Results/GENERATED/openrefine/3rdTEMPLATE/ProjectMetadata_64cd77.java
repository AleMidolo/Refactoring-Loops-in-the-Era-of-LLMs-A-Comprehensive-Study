_userMetadata.stream()
    .filter(obj -> ((ObjectNode) obj).get("name").asText("").equals(metaName))
    .forEach(obj -> ((ObjectNode) obj).put("value", valueString));