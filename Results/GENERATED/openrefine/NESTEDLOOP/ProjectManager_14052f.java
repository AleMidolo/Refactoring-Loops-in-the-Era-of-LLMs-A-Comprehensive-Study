userMetadataPreference.stream()
        .filter(jsonObj -> isValidUserMetadataDefinition((ObjectNode) jsonObj))
        .forEach(placeHolderJsonObj -> {
            boolean found = jsonObjArray.stream()
                    .filter(jsonObj -> jsonObj instanceof ObjectNode)
                    .anyMatch(jsonObj -> ((ObjectNode) jsonObj).get("name").asText("").equals(((ObjectNode) placeHolderJsonObj).get("name").asText("")));
            if (!found) {
                ((ObjectNode) placeHolderJsonObj).put("value", "");
                metadata.getUserMetadata().add((ObjectNode) placeHolderJsonObj);
                logger.info("Put the placeholder {} for project {}", ((ObjectNode) placeHolderJsonObj).get("name").asText(""), metadata.getName());
            } else {
                ObjectNode node = (ObjectNode) jsonObjArray.stream()
                        .filter(jsonObj -> jsonObj instanceof ObjectNode)
                        .filter(jsonObj -> ((ObjectNode) jsonObj).get("name").asText("").equals(((ObjectNode) placeHolderJsonObj).get("name").asText("")))
                        .findFirst()
                        .orElse(null);
                if (node != null) {
                    node.set("display", ((ObjectNode) placeHolderJsonObj).get("display"));
                }
            }
        });