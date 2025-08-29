userMetadataPreference.stream()
    .filter(placeHolderJsonObj -> isValidUserMetadataDefinition((ObjectNode) placeHolderJsonObj))
    .forEach(placeHolderJsonObj -> {
        boolean found = jsonObjArray.stream()
            .filter(jsonObj -> jsonObj instanceof ObjectNode)
            .map(jsonObj -> (ObjectNode) jsonObj)
            .filter(node -> node.get("name").asText("").equals(placeHolderJsonObj.get("name").asText("")))
            .findFirst()
            .map(node -> {
                node.set("display", placeHolderJsonObj.get("display"));
                return true;
            })
            .orElseGet(() -> {
                placeHolderJsonObj.put("value", "");
                metadata.getUserMetadata().add(placeHolderJsonObj);
                logger.info("Put the placeholder {} for project {}", placeHolderJsonObj.get("name").asText(""), metadata.getName());
                return false;
            });
    });