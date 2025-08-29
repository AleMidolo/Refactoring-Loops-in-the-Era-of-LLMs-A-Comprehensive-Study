userMetadataPreference.stream()
    .map(obj -> (ObjectNode) obj)
    .filter(this::isValidUserMetadataDefinition)
    .forEach(placeHolderJsonObj -> {
        boolean found = jsonObjArray.stream()
            .filter(jsonObj -> jsonObj instanceof ObjectNode)
            .map(jsonObj -> (ObjectNode) jsonObj)
            .anyMatch(node -> node.get("name").asText("").equals(placeHolderJsonObj.get("name").asText("")));
    
        if (!found) {
            placeHolderJsonObj.put("value", "");
            metadata.getUserMetadata().add(placeHolderJsonObj);
            logger.info("Put the placeholder {} for project {}", placeHolderJsonObj.get("name").asText(""), metadata.getName());
        } else {
            ObjectNode node = jsonObjArray.stream()
                .filter(jsonObj -> jsonObj instanceof ObjectNode)
                .map(jsonObj -> (ObjectNode) jsonObj)
                .filter(node -> node.get("name").asText("").equals(placeHolderJsonObj.get("name").asText("")))
                .findFirst()
                .orElse(null);
            
            if (node != null) {
                node.set("display", placeHolderJsonObj.get("display"));
            }
        }
    });