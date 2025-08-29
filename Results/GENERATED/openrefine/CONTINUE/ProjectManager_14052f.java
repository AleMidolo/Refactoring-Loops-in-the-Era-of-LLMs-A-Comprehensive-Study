userMetadataPreference.stream()
    .filter(obj -> isValidUserMetadataDefinition((ObjectNode) obj))
    .forEach(placeHolderJsonObj -> {
        boolean found = jsonObjArray.stream()
            .filter(jsonObj -> jsonObj instanceof ObjectNode)
            .map(jsonObj -> (ObjectNode) jsonObj)
            .anyMatch(node -> node.get("name").asText("").equals(placeHolderJsonObj.get("name").asText("")));
        if (!found) {
            ((ObjectNode) placeHolderJsonObj).put("value", "");
            metadata.getUserMetadata().add((ObjectNode) placeHolderJsonObj);
            logger.info("Put the placeholder {} for project {}", placeHolderJsonObj.get("name").asText(""), metadata.getName());
        } else {
            jsonObjArray.stream()
                .filter(jsonObj -> jsonObj instanceof ObjectNode)
                .map(jsonObj -> (ObjectNode) jsonObj)
                .filter(node -> node.get("name").asText("").equals(placeHolderJsonObj.get("name").asText("")))
                .findFirst()
                .ifPresent(node -> node.set("display", placeHolderJsonObj.get("display")));
        }
    });