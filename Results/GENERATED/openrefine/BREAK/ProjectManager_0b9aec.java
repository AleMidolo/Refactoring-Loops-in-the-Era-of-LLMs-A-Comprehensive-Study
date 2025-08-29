userMetadataPreference.stream()
        .filter(obj -> isValidUserMetadataDefinition((ObjectNode) obj))
        .forEach(placeHolderJsonObj -> {
            boolean found = jsonObjArray.stream()
                    .filter(jsonObj -> jsonObj instanceof ObjectNode)
                    .anyMatch(jsonObj -> {
                        ObjectNode node = (ObjectNode) jsonObj;
                        return node.get("name").asText("").equals(((ObjectNode) placeHolderJsonObj).get("name").asText(""));
                    });
            if (!found) {
                ((ObjectNode) placeHolderJsonObj).put("value", "");
                metadata.getUserMetadata().add((ObjectNode) placeHolderJsonObj);
                logger.info("Put the placeholder {} for project {}", ((ObjectNode) placeHolderJsonObj).get("name").asText(""), metadata.getName());
            }
        });